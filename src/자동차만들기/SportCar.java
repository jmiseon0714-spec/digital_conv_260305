package 자동차만들기;


public class SportCar extends Car {
    private boolean isTurboOn = false;
    public SportCar(String name) {
        super(250, 8.0, 30, 2, name);
    }

    @Override
    public void setMode(boolean isOn) {  // 부가기능 : 터보(속도 20% 증가)
        if (isOn && !isTurboOn) {
            speed *= 1.2;
            isTurboOn = true;
            System.out.println("터보모드가 작동합니다.");

        } else if (!isOn && isTurboOn) {
            speed /= 1.2;
            isTurboOn = false;
            System.out.println("터보모드가 중지 되었습니다.");
        }
    }
}
