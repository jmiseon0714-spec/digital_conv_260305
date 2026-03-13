package 택배배송시스템;

public class Manager {
    String name;
    public Manager(String name) {
        this.name = name;
    }
    public void send(Delivery delivery) {
        System.out.print(name + "매니저가 " + "회사의 배송을 진행합니다.");
        delivery.deliver();
    }
}
