package 택배배송시스템;

public class Delivery {
    String company;  // 배송회사 이름

    // 생성자는 클래스 이름과 동일, 반환 타입이 없음, 객체 생성 시 호출, 오버로딩 가능
    // 접근 제한자가 public이 없으면 다른 패키지에 있는 클래스는 생성할 수 없음
    public Delivery(String company) {   // 부모
        this.company = company;
    }

    public void deliver() {
        System.out.println("배송을 시작합니다.");
    }

    public String getCompany() {
        return company;
    }
}

// Delivery 상속 받아 ParcelDelivery 클래스 생성
// extends 상속은 단일 상속만 가능
class ParcelDelivery extends Delivery {
    public ParcelDelivery(String company) {
        super(company);  // 부모의 생성자를 호출함
    }
    @Override // 오버라이딩 관계가 성립하는지 문법적으로 체크해주는 역할
    public void deliver() {
        System.out.println("택배 배송을 시작합니다. 2~3일 소요됩니다.");
    }
}

class QuickDelivery extends Delivery {
    public QuickDelivery(String company) {
        super(company);  // 부모의 생성자를 호출함
    }
    @Override
    public void deliver() {
        System.out.println("퀵 배송을 시작합니다. 당일 도착 예정입니다.");
    }
}

class AirDelivery extends Delivery {
    public AirDelivery(String company) {
        super(company);
    }
    @Override
    public void deliver() {
        System.out.println("항공 배송을 시작합니다. 해외로 출발합니다.");
    }
}

//class Manager {
//    String name;
//    public Manager(String name) {
//        this.name = name;
//    }
//    void send(Delivery delivery) {
//        System.out.print("○○회사가 배송을 진행합니다.");
//        delivery.deliver();
//        System.out.println();
//    }
//}
