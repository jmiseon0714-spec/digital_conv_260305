package 배열실습;

// 실습 문제 1번
// 햄버거 3개와 음료 2개의 가격을 입력받기 (5개의 가격을 연속으로 입력 받음)
// 세트 메뉴 가격 = (햄버거 3개 중 가장 싼 메뉴 가격 + 음료 둘 중 싼 메뉴 가격) - 50(세트 할인)

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
            int[] menu = new int[5];
            Scanner sc = new Scanner(System.in);

            System.out.print("햄버거 3개 음료 2개 가격 연속 입력 : ");
            for (int i = 0; i < menu.length; i++) {
                menu[i] = sc.nextInt();
            }

            int minBurger = menu[0];  // 배열 내의 값으로 최소 값을 지정
            int minDrink = menu[3];

            for (int i = 0; i < menu.length; i++) {
                if (i < 3 && minBurger > menu[i]) minBurger = menu[i];
                if (i > 2 && minDrink > menu[i]) minDrink = menu[i];
            }
            System.out.printf("세트 메뉴 가격 : %d\n", minBurger + minDrink - 50);

        }

    }
