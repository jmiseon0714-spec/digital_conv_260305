package 데몬쓰레드;
// 데몬스레드 : 다른 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
// 데몬스레드 이외의 스레드가 모두 종료되면 데몬스레드도 강제 종료

public class DaemonMain {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);  // 데몬스레드 옵션, 끝나는
        autoSaveThread.start();
        Thread.sleep(10000);  // 10초
    }
}

class AutoSaveThread extends Thread {
    public void save() {  // 일반 메서드
        System.out.println("작업 내용을 저장함");
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);  // 1초
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}
