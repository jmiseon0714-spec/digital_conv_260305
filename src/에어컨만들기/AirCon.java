package 에어컨만들기;
// 기능 설계
// - 전원 ON/OFF 기능
// - 온도 설정 기능 (1도 단위 설정)
// - 현재 온도 표시 기능
// - 냉방기 ON/OFF 기능
// - 난방기 ON/OFF 기능
// - 바람세기 설정 (1단계 / 2단계 / 3단계)

// 생성자 만들기

// 각가의 필드에 대한 게터와 세터 만들기

// 에어컨의 전체 정보 상태를 보여주는 메서드 만들기

public class AirCon {
    boolean power;  // 전원
    int tempSet;  // 온도 설정
    int tempNow;  // 현재 온도 표시
    boolean cooler;  // ON/OFF
    boolean heater; // ON/OFF
    int wind;  // 1/2/3

    public AirCon() {
        power = false;
        tempSet = 20;  // 설정 온도
        tempNow = 20;  // 현재 온도
        cooler = false;
        heater = false;
        wind = 1;
    }
    public AirCon(boolean onOff, int tem, int win) {
        power = onOff;
        tempSet = tem;
        cooler = onOff;
        heater = onOff;
        wind = win;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getTempSet() {
        return tempSet;
    }

    public void setTempSet(int tempSet) {
        this.tempSet = tempSet;
    }

    public int getTempNow() {
        return tempNow;
    }

    public void setTempNow(int tempNow) {
        this.tempNow = tempNow;
    }

    public boolean isCooler() {
        return cooler;
    }

    public void setCooler(boolean cooler) {
        this.cooler = cooler;
    }

    public boolean isHeater() {
        return heater;
    }

    public void setHeater(boolean heater) {
        this.heater = heater;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        wind = wind;
    }

    public void printAircon() {
        final String[] step = {"", "1단계", "2단계", "3단계"};
        System.out.println("======== 에어컨 정보 =======");
        System.out.println("전원 " + (power ? "ON" : "OFF") );
        System.out.println("현재 온도 : " + getTempNow());
        System.out.println("설정 온도 : " + getTempSet());
        System.out.println("냉방 모드 : " + (cooler ? "ON" : "OFF"));
        System.out.println("냉방 모드 : " + (heater ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + step[wind]);

    }





    //    public void setPower(boolean onOff) {
//        this.power = power;
//        System.out.println("전원을 " + (power ? "ON" : "OFF") + "합니다");
//    }
//    public void setTemperature(int temperature) {
//        temperature = temperature;
//        System.out.println("온도를 " + temperature + "으로 설정합니다.");
//    }
//    public void setCold(boolean onOff) {
//        cooler = cooler;
//        System.out.println("냉방기 전원을 " + (power ? "ON" : "OFF") + "합니다");
//    }
//    public void setHot(boolean onOff) {
//        hot = hot;
//        System.out.println("난방기 전원을 " + (power ? "ON" : "OFF") + "합니다");
//    }
//
//
//    public boolean getPower() {
//        return power;
//    }
//    public int getTemperature() {
//        return tempSet;
//    }
//    public boolean getCold() {
//        return cooler;
//    }
//    public boolean getHot() {
//        return hot;
//    }
//    public int getWind() {
//        return wind;
//    }



}
