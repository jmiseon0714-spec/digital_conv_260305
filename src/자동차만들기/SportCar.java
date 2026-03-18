package 자동차만들기;


public class SportCar extends Car implements AirCon, Audio{
    private boolean isTurboOn = false;
    public SportCar(String name) {
        super(250, 8.0, 30, 2, name);
    }
    private double originalFuelEff = mileage;
    private boolean isAirConOn = false;
    private boolean isAudioOn;

    public boolean isAudioOn() {
        return isAudioOn;
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
        public void setAudio(boolean isOn) {
            this.isAudioOn = isOn;
            String status = isAudioOn ? "ON" : "OFF";
            System.out.println(name + "의 오디오가 " + status + " 상태입니다.");
        }

    }
