package 더블for실습;
// 입력 : 5
// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;

public class DoubleForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.printf("|i=%2d|", i);
            for (int j = 0; j < i + 1; j++) {  // i = 0, 0 일 때 한번 진입
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
