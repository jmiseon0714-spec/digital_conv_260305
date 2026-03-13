package 택배배송시스템;

import java.util.Scanner;

public class PolyMain3 {
    public static void main(String[] args) {
        Manager manager = new Manager("장원영");
        Scanner sc = new Scanner(System.in);
        System.out.print("[1]택배 배송 [2]퀵 배송 [3]항공 배송 : ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                manager.send(new ParcelDelivery("대한통운"));
                break;
            case 2:
                manager.send(new QuickDelivery("한진택배"));
                break;
            case 3:
                manager.send(new AirDelivery("롯데택배"));
                break;
            default:
                System.out.println("배송 시스템을 잘못 선택하셨습니다.");
        }

    }
}
