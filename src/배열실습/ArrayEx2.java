package 배열실습;

// 실습 문제 2번
// 8개의 정수를 입력 받아 배열에 저장
// 홀수는 홀수 배열에 나누어 담고, 짝수는 짝수 배열에 나누어 담아서 출력하기


import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = new int[8]; // 8개의 정수를 입력 받기 위한 배열 생성
        int[] oddArray = new int[8];  // 홀수 값을 저장하기 위한 배열 생성
        int[] evenArray = new int[8];  // 짝수 값을 저장하기 위한 배열 생성

        // 8개의 정수값 입력 받기
        System.out.print("정수 값 입력 : ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = sc.nextInt();
        }

        // 홀수 배열, 짝수 배열 나누어 담기
        int oddIndex = 0;
        int evenIndex = 0 ;
        for (int e : inputArray) {
            if (e % 2 == 0) evenArray[evenIndex++] = e; // 값을 대입 후 인덱스를 증가
            else oddArray[oddIndex++] = e;
        }

        // 출력
        System.out.println("홀수 : ");
        for (int i = 0; i < oddIndex; i++) System.out.print(oddArray[i] + " ");
        System.out.println();
        System.out.println("짝수 : ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evenArray[i] + " ");
    }
}
