package 상속TV;

// ProtoYypeTV를 상속받아 ProductTV 클래스 생성
public class ProductTV extends ProtoTypeTV {
    String name;
    boolean isSmart;

    ProductTV() {
        super();
        this.name = "TV";
        isSmart = false;
    }
    // 생성자 오버로딩
    ProductTV(boolean power, int cnl, int vol, String name) {
        super(power, cnl, vol);  // 부모의 생성자를 불러줌, 자식 객체가 만들어 지려면 생성자에서 부모의 생성자를 먼저 불러줘야 함
        this.name = name;  // 자식의 필드를 불러준 것
        isSmart= false; // this는 생략해도 됨
    }
    // 볼륨 설정 기능 추가 : 0 ~ 100까지만 유효값으로 입력받게 하고 나머지는 오류 처리
    @Override
    void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + vol + "로 변경했습니다.");
        } else {
            System.out.println("볼륨 설정 범위를 벗어났습니다.");
        }
    }
    // 채널 설정 기능을 오버라이딩해서 1 ~ 1999까지 설정되도록 변경
    @Override
    void setChannel (int cnl) {
        if (cnl >= 1 && cnl <= 1999) {
            channel = cnl;
            System.out.println("채널을 " + cnl + "로 변경했습니다.");
        } else {
            System.out.println("채널 설정 범위를 벗어났습니다.");
        }
    }

    // 오버라이딩된 설정 기능을 오버로딩해서 인터넷 모드 추가
    // 스마트 기능을 켜면 인터넷 기능이 켜지고 채널 설정은 무시됨
    void setChannel(int cnl, boolean smart) {
        if (smart) {
            isSmart = true;
        } else {
            setChannel(cnl);
        }
    }

    // 티비 정보 출력 기능
    void printTV() {
        System.out.println("===== TV 정보 출력 =====");
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + (power ? "ON"  :  "OFF"));
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("스마트모드 : " + (isSmart ? "ON" : "OFF"));
    }
}
