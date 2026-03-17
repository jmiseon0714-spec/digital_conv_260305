package 자동차만들기;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  이동 지역 선택
        System.out.println("\n[1] 부산(400km) [2] 대전(150km) [3] 강릉(200km) [4] 광주(300km)");
        System.out.print("이동 지역을 선택하세요 : ");
        int cityChoice = sc.nextInt();
        int distance = 0;
        switch (cityChoice) {
            case 1:
                distance = 400;
                break;
            case 2:
                distance = 150;
                break;
            case 3:
                distance = 200;
                break;
            case 4:
                distance = 300;
                break;
            default:
                System.out.println("잘못된 지역 선택입니다.");
                return;
        }

        // 승객 수 입력
        System.out.print("이동할 승객 수를 입력하세요 (1~100명) : ");
        int passCnt = sc.nextInt();

        Car car = null;
        while (car == null) {
            System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carChoice = sc.nextInt();

            switch (carChoice) {
                case 1:
                    car = new SportCar("스포츠카");
                    break;
                case 2:
                    car = new Sedan("승용차");
                    break;
                case 3:
                    car = new Bus("버스");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 1~3 사이의 숫자를 입력해주세요.");
            }
        }


        boolean isMode = false; // 루프 밖에서 사용할 변수 미리 선언

        while (true) {
            System.out.print("부가기능을 사용하시겠습니까? [1]YES [2]NO : ");
            int modeChoice = sc.nextInt();

            if (modeChoice == 1) {
                isMode = true;
                break;
            } else if (modeChoice == 2) {
                isMode = false;
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1번(YES) 또는 2번(NO)을 선택해주세요.");
            }
        }

        car.setMode(isMode);


        double weather = 1.0; // 기본값 설정

        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
            int weatherInput = sc.nextInt();

            if (weatherInput == 1) {
                weather = 1.0;
                break;
            } else if (weatherInput == 2) {
                weather = 1.2;
                break;
            } else if (weatherInput == 3) {
                weather = 1.4;
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1, 2, 3번 중에서 선택해주세요.");
            }
        }


        // 결과 출력
        System.out.println("\n========= 이동 결과 =========");
        System.out.println("총 비용 : " + car.cost(distance, car.moveCnt(passCnt)) + "원");
        System.out.println("주유 횟수 : " + car.refuel(distance, car.moveCnt(passCnt)) + "회");

        // 매개변수 순서 주의: distance, speed, moveCnt, weatherWeight
        double totalTime = car.distanceTime(distance, car.speed, car.moveCnt(passCnt), weather);
        int h = (int) totalTime;                         // 정수 부분만 취해서 '시간' 추출
        int m = (int) Math.round((totalTime - h) * 60);
        System.out.printf("총 소요 시간 : %d시간 %d분\n", h, m);

        System.out.println("총 이동 횟수 : " + car.moveCnt(passCnt) + "회");
        System.out.println("============================");
    }
}
