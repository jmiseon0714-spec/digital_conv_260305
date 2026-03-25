package 쇼핑몰시스템;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StockManager stockManager = new StockManager("맥북 프로 M4", 10);
        StockMonitor stockMonitor = new StockMonitor(stockManager);
        stockMonitor.start();

        String[][] orders = {
                {"user01", "2"}, {"user02", "1"}, {"user03", "3"}, {"user04", "1"},
                {"user05", "2"}, {"user06", "1"}, {"user07", "1"}, {"user08", "2"},
                {"user09", "1"}, {"user10", "1"}, {"user11", "1"}, {"user12", "2"},
                {"user13", "1"}, {"user14", "1"}, {"user15", "3"}
        };

        List<Thread> threads = new ArrayList<>();

        for (String[] order : orders) {
            String userId = order[0];
            int quantity = Integer.parseInt(order[1]);
            Thread t = new Thread(new OrderThread(stockManager, userId, quantity));
            t.setName("order-" + userId);
            threads.add(t);
        }

        System.out.println("======= 쇼핑몰 주문 시스템 오픈 ======");
        System.out.printf("상품 : %s | 초기 재고 : %d개%n%n", stockManager.getProductName(), stockManager.getStock());

        for (Thread t : threads) {
            t.start();
            Thread.sleep(30);
        }
        for (Thread t : threads) {
            t.join();
        }

        stockMonitor.stopMonitor();

        System.out.println();
        System.out.println("======= 주문 처리 완료 =======");
        System.out.printf("최종 잔여 재고 : %d개%n", stockManager.getStock());
        System.out.printf("총 성공 주문수 : %d건%n", stockManager.getTotalOrders());
    }
}


class StockManager {
    final String productName;
    private int stock;
    private boolean outOfStock = false;
    private int totalOrders = 0;

    public StockManager(String productName, int initialStock) {
        this.productName = productName;
        this.stock = initialStock;
    }

    public synchronized boolean order(String userId, int quantity) {
        if (outOfStock) {
            return false;
        }
        if (stock < quantity) {
            System.out.printf("주문 실패 %-8s | 요청 %d개 | 재고 부족 (현재 %d개%n)", userId, quantity, stock);
            return false;
        }
        try {
            System.out.printf("처리중 %-8s | %d개 주문 결제 진행%n", userId, quantity);
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
        stock -= quantity;
        totalOrders++;

        System.out.printf("주문완료 %-8s | %d개 구매 | 잔여재고 : %d개%n", userId, quantity, stock);

        if (stock == 0) {
            outOfStock = true;
            notify();
        }
        return true;
    }
    public synchronized void waitUntilOutOfStock() throws InterruptedException {
        while (!outOfStock) {
            wait();
        }
    }
    public boolean isOutOfStock() {
        return outOfStock;
    }
    public int getStock() {
        return stock;
    }
    public int getTotalOrders() {
        return totalOrders;
    }
    public String getProductName() {
        return productName;
    }

}


class OrderThread extends Thread{
    final StockManager stockManager;
    final String userId;
    final int quantity;

    public OrderThread(StockManager stockManager, String userId, int quantity) {
        this.stockManager = stockManager;
        this.userId = userId;
        this.quantity = quantity;
    }
    @Override
    public void run() {
        if (stockManager.isOutOfStock()) {
            System.out.printf("품절 %-8s | 주문 불가 (이미 품절)%n",userId);
            return;
        }
        System.out.printf("접속 %-8s | %d개 주문 시도%n", userId, quantity);
        boolean success = stockManager.order(userId, quantity);

        if (!success && !stockManager.isOutOfStock()) {
            System.out.printf("실패 %-8s | 주문 처리 중 오류 발생%n", userId);
        }
    }
}


class StockMonitor extends Thread {
    final StockManager stockManager;
    volatile boolean stop = false;

    public StockMonitor(StockManager stockManager) {
        this.stockManager = stockManager;
        this.setDaemon(true);
        this.setName("stock-monitor");
    }
    public void stopMonitor() {
        stop = true;
        interrupt();
    }
    @Override
    public void run() {
        System.out.println("모니터 재고 감시 시작 -> 상품 : " + stockManager.getProductName());

        try {
            stockManager.waitUntilOutOfStock();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        if (!stop) {
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("품절알림 " + stockManager.getProductName() + "재고 소진");
            System.out.println("대기 고객 전원에게 품절 알림 발송 완료");
            System.out.println("총 주문 성공 건수 : " + stockManager.getTotalOrders() + "건");
            System.out.println("---------------------------------");
        }
    }
}