package 전자기기;

public class Printer extends Device{
    @Override
    public void turnOn() {
        System.out.println("프린터 전원을 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("프린터 전원을 끕니다.");
    }
}
