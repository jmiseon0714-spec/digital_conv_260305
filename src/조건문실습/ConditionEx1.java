package 조건문실습;

import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요 : ");
        double cm = sc.nextDouble();
        System.out.print("몸무게를 입력하세요 : ");
        double kg = sc.nextDouble();

        double m = cm / 100;

        double bmi = kg / (m * m);

        System.out.printf("당신의 BMI는 %.2f 입니다.%n", bmi);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상");
        } else if (bmi < 25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }




    }
}
