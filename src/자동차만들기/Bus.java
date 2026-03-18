package 자동차만들기;


public class Bus extends Car implements AirCon, AutoPilot {
    private boolean isTankOn = false; //

    public Bus(String name) {
        super(150, 5.0, 100, 20, name);
        this.originalFuelEff = mileage;
        this.originalMaxSpeed = speed;
    }
    private double originalFuelEff;
    private boolean isAirConOn = false;
    private int originalMaxSpeed;
    private boolean isAutoPilotOn = false;

    public boolean isAutoPilotOn() {
        return isAutoPilotOn;
    }


    @Override
    public void setMode(boolean isOn) {
        if (isOn && !isTankOn) {  // 부가기능 : 보조 연료탱크(30L 추가)
            this.tank += 30;
            isTankOn = true;
            System.out.println("보조 연료탱크가 추가되었습니다. 현재 탱크: " + tank + "L");
        } else if (!isOn && isTankOn) {
            this.tank -= 30;
            isTankOn = false;
            System.out.println("보조 연료탱크 사용을 중지합니다.");
        }
    }
    @Override
    public void setAirCon(boolean isOn) {
        if (isOn && !isAirConOn) {
            this.mileage = originalFuelEff * 0.95;
            isAirConOn = true;
            System.out.println(name + "의 에어컨을 켭니다. (연비 5% 감소)");
        } else if (!isOn && isAirConOn) {
            this.mileage = originalFuelEff;
            isAirConOn = false;
            System.out.println(name + "의 에어컨을 끕니다. (연비 복구)");
        }
    }
    @Override
    public void setAutoPilot(boolean isOn) {
        if (isOn && !isAutoPilotOn) {
            this.speed = (int) (originalMaxSpeed * 0.9);
            isAutoPilotOn = true;
            System.out.println(name + "의 자율주행 모드를 활성화합니다. (최고속도 10% 감소 : " + this.speed + "km/h");
        } else if (!isOn && isAutoPilotOn) {
            this.speed = originalMaxSpeed;
            isAutoPilotOn = false;
            System.out.println(name + "의 자율주행 모드를 해제합니다.");
        }
    }

}
