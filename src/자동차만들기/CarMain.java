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

        // 차량 종류 선택
        System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carChoice = sc.nextInt();
        Car car = null;

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
                System.out.println("차량을 잘못 선택하셨습니다.");
                return;
        }

        // 부가기능 선택
        System.out.print("부가기능을 사용하시겠습니까? [1]YES [2]NO : ");
        boolean isMode = (sc.nextInt() == 1);
        car.setMode(isMode);

        //  날씨 선택
        System.out.print("날씨 선택 [1]맑음 [2]비 [3]눈 : ");
        int weatherInput = sc.nextInt();
        double weather = 1.0; //
        switch (weatherInput) {
            case 2:
                weather = 1.2;
                break;
            case 3:
                weather = 1.4;
                break;
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
