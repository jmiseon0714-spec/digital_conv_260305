package 다형성2번;

public class Vehicle {
    public void move() {
        System.out.println("차량이 달립니다.");
    }
    public void info() {
        System.out.println("버스");
    }
}

class Bus extends Vehicle {  // 상속 받기
    @Override
    public void move() {
        System.out.println("버스가 달립니다.");
    }
    public void info() {
        System.out.println("버스");
    }
}

class Taxi extends Vehicle {
    @Override
    public void move() {
        System.out.println("택시가 달립니다.");
    }
}

class SportCar extends Vehicle {
    @Override
    public void move() {
        System.out.println("스포츠카가 달립니다.");
    }
}

class Truck extends Vehicle {  // 내가 추가한 것
    @Override
    public void move() {
        System.out.println("트럭이 달립니다.");
    }
}

class Driver {
    String name;
    public Driver(String name) {
        this.name = name;  // 생성자를 통해 이름 주입받기
    }

//    void drive(Vehicle vehicle) {
//        System.out.print(name + "의 ");
//        vehicle.move();
//        vehicle.info();
//    } // 오버 로딩 할 때 막아두기
    void drive(Bus bus) {

    }
    void drive(Taxi taxi) {

    }
    void drive(SportCar sportCar) {

    }
    void drive(Truck truck) {

    }
}