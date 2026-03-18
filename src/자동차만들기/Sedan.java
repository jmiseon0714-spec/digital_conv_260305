package 자동차만들기;

public class Sedan extends Car implements AirCon, AutoPilot, Audio {
    private boolean seatOn = false;

    public Sedan(String name) {
        super(200, 12.0, 45, 4, name);
        this.mileage = mileage;
        this.speed = speed;
    }


    private double originalFuelEff;
    private boolean isAirConOn = false;
    private int originalMaxSpeed;
    private boolean isAutoPilotOn;
    private boolean isAudioOn;

    public boolean isAudioOn() {
        return isAudioOn;
    }

    public boolean isAutoPilotOn() {
        return isAutoPilotOn;
    }


    @Override
    public void setMode(boolean isOn) {
        if (isOn && !seatOn) {  // 부가기능 : 트렁크 좌석화(좌석 1석 추가)
            this.seat += 1;
            seatOn = true;
            System.out.println("트렁크 좌석화가 작동합니다. 현재 좌석: " + seat + "석");
        } else if (!isOn && seatOn) {
            this.seat -= 1;
            seatOn = false;
            System.out.println("트렁크 좌석화가 해제되었습니다.");
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
            this.speed = (int)(originalMaxSpeed * 0.9);
            isAutoPilotOn = true;
            System.out.println(name + "의 자율주행 모드를 활성화합니다. (최고속도 10% 감소 : " + this.speed + "km/h");
        } else if (!isOn && isAutoPilotOn) {
            this.speed = originalMaxSpeed;
            isAutoPilotOn = false;
            System.out.println(name + "의 자율주행 모드를 해제합니다.");
        }
    }
    @Override
    public void setAudio(boolean isOn) {
        this.isAudioOn = isOn;
        String status = isAudioOn ? "ON" : "OFF";
        System.out.println(name + "의 오디오가 " + status + " 상태입니다.");
    }

}