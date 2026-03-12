package 에어컨만들기;

import 텔레비전.Television;

import java.util.Scanner;

public class AirConMain {
    public static void main(String[] args) {
        AirCon airCon1 = new AirCon();
        AirCon airCon2 = new AirCon();
        AirCon airCon3 = new AirCon();
        AirCon airCon4 = new AirCon();
        AirCon airCon5 = new AirCon();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 전원 켜기");
            System.out.println("2. 온도 설정");
            System.out.println("3. 현재 온도 표시");
            System.out.println("4. 냉방기");
            System.out.println("5. 난방기");
            System.out.println("6. 바람세기 설정");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

//            switch (menu) {
//                case 1:
//                    airCon1.setPower(true);
//                    break;
//                case 2:
//                    System.out.print("온도 설정값 입력 : ");
//                    int volume = sc.nextInt();
//                    airCon1.setTempSet();
//                    break;
//                case 3:
//                    airCon1.setTempNow();
//                case 4:
//                    airCon1.setCooler(true);
//                    break;
//                case 5:
//                    airCon1.setHeater(true);
//                    break;
//                case 6:
//                    System.out.print("바람 세기 입력 : ");
//                    airCon1.setWind();




            }

        }
    }

