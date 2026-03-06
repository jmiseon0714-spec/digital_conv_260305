package 스위치실습1;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("투입 금액을 입력하세요. : ");
        String price = sc.next();
        System.out.println("메뉴번호를 입력하세요. : ");
        String number = sc.next();
        char op = sc.next().charAt(0);

        switch (op) {
            case '1':
                System.out.println("콜라 1,500원");
                break;
            case '2':
                System.out.println("사이다 1,500원");
                break;
            case '3':
                System.out.println("커피 1,000원");
                break;
            case '4':
                System.out.println("생수 500원");
                break;
            default:
                System.out.println("없는 메뉴입니다.");
                break;
        }
    }
}
