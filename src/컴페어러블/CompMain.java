package 컴페어러블;
// Comparable과 Comparator는 자바에서 객체를 정렬하는데 사용하는 인터페이스
// Comparable : 나와 다른 객체를 비교하는 방식
// Comparator : 다른 두 객체를 비교하는 방식

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class CompMain {
    public static void main(String[] args) {
        TreeSet<Car> cars = new TreeSet<>();  // Tree는 자동 정렬
        // List<Car> cars = new ArrayList<>();  ArrayList로
        cars.add(new Car("BMW", 2010, "Red"));
        cars.add(new Car("Mercedes", 2015, "Blue"));
        cars.add(new Car("Mercedes", 2015, "Black"));
        cars.add(new Car("Toyota", 2018, "White"));
        cars.add(new Car("Honda", 2013, "Silver"));

        // Collections.sort(cars);  ArrayList 사용할 떄 정렬하기 위해 사용

        for (Car car : cars) {
            System.out.println("이름 : " + car.name);
            System.out.println("연식 : " + car.year);
            System.out.println("색상 : " + car.color);
            System.out.println("------------------------------------");
        }

    }
}
class Car implements Comparable<Car> {
    String name;
    int year;  // 연식
    String color;

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    @Override
    public int compareTo(Car o) {  // 정렬 규칙 넣기 : 최신 연식 기준, 연식이 같으면 차량 이름
        // 1. 연식 기준
        if (this.year != o.year) {
            return o.year - this.year;  // 뒤의 값 - 앞의 값 = 양수가 나오면 정렬, 음수가 나오면 그대로
        }
        // return this.name.compareTo(o.name);  // 사전순 정렬
        // 2. 이름순 정렬
        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }
        // 3. 색상 정렬
        return this.color.compareTo(o.color);
    }
}
