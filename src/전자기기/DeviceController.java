package 전자기기;

public class DeviceController<T extends Device> {
    private T device;

    public void setDevice(T device) {
        this.device = device;
    }
    public void powerOn() {
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("연결된 기기가 없습니다.");
        }
    }
    public void powerOff() {
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("연결된 기기가 없습니다.");
        }
    }

}
