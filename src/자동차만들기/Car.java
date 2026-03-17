package 자동차만들기;

public abstract class Car {

    protected int speed;  // 속도
    protected double mileage;  // 연비
    protected int tank;  // 연료탱크 크기
    protected int seat;  // 좌석 수
    protected String name;  // 차량 이름

    public Car(int speed, double mileage, int tank, int seat, String name) {
        this.speed = speed;
        this.mileage = mileage;
        this.tank = tank;
        this.seat = seat;
        this.name = name;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // 공통 기능
    // 총 이동 횟수: ceil(승객 수 / 좌석 수)
    public int moveCnt(int passCnt) {
        return (int) Math.ceil((double) passCnt / this.seat);
    }
    // 주유 횟수 계산: ceil(총 연료 소모량 / 연료탱크 크기)
    public int refuel(double distance, int moveCnt) {
        double totalDistance = distance * moveCnt;
        double totalFuelConsumption = totalDistance / this.mileage;
        return (int) Math.ceil(totalFuelConsumption / this.tank);
    }
    // 총 비용 계산 : 총 연료 소모량 × 2,000원
    public int cost(double distance, int moveCnt) {
        double totalDistance = distance * moveCnt;
        double totalFuelConsumption = totalDistance / this.mileage;
        return (int) (totalFuelConsumption * 2000);
    }
    // 총 이동 시간 계산 : 거리 ÷ 속도 × 횟수 × 날씨 보정계수 (1.0, 1.2, 1.4)
    public double distanceTime(double distance, double speed, int moveCnt, double weather) {
        return (distance / speed) * moveCnt * weather;
    }

    // 추상 메서드
    public abstract void setMode(boolean isOn);


}

