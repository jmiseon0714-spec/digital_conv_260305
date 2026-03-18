package Math클래스;
// Math 클래스 : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
// - 객체를 만들어서 사용하지 않음

public class MathMain {
    public static void main(String[] args) {
        // random 메서드 : 0.0 이상 ~ 1.0 미만의 범위에서 임의의 실수(double)값을 생성하여 반환
        // 1 ~ 100까지의 임의의 정수 10개 생성하기
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", (int) (Math.random() * 100 + 1));
        }
        System.out.println();

        // 중복되지 않는 로또 번호 생성하기
        // 1 ~ 45 사이의 임의의 값 6개
        // 배열 사용하기
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", (int) (Math.random() * 45 + 1));
        }


        // boolean isExist = false;  // 중복 여부 확인
        // int index = 0;
        // while (true) { // 중복이 몇번 일어날지 모르기 때문에 무한 반복문 처리
        //    int rand = (int) (Math.random() * 45 + 1);  // 1 ~ 45 사이의 정수값 생성
        //    for (int i = -; i < lotto.length; i++) {
        //        if (lotto[i] == rand) isExist = true;
        // }
        // if (!isExist) lotto[index++] = rand;
        // if (index == lotto.length) break;  // 6개
        // isExist = false;  // 중복되지 않음으로 값 변경
        // }
        // for (int e : lotto) System.out.printf("%d ", e);
        // System.out.println();

        // abs() :  절대값 구하는 메서드 ... 통계할 때
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));

        // floor() : 주어진 숫자를 내림한 결과값 반환
        // ceil() : 주어진 숫자를 올림한 결과값 반환
        // round() : 반올림한 결과를 반환
        System.out.println(Math.floor(10.5));
        System.out.println(Math.ceil(10.5));
        System.out.println(Math.round(10.5));
        System.out.println(Math.min(100, 200));
        System.out.println(Math.max(100, 200));

        System.out.println();


        // 실습문제
        // 1. 일주일 기온 데이터 출력 (1일 ~ 7일)
        // 2. 최저기온, 최고기온, 일교차 출력하기
        int[] temps = {-5, 3, -12, 7, -1, 15, -8};
        System.out.println("===== 일주일 기온 분석 =====");

        int min = temps[0];
        int max = temps[0];
        for (int i = 1; i < temps.length; i++) {
            System.out.printf("%d 일 : %d 도\n", i + 1, temps[i]);
            if (temps[i] < min) min = temps[i];
            if (temps[i] > max) max = temps[i];
        }
        System.out.println("최저기온 : " + min + "도");
        System.out.println("최고기온 : " + max + "도");
        System.out.println("일교차 : " + Math.abs(max - min) + "도");

    }
}
