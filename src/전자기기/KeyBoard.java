package 전자기기;

public class KeyBoard extends Device {
    @Override
    public void turnOn() {
        System.out.println("키보드 전원을 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("키보드의 전원을 끕니다.");
    }
}
