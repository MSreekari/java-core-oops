package concepts.scenarios;

class Device{
    private String deviceName;
    private int powerConsumption;

    public Device(String deviceName, int powerConsumption){
        this.deviceName = deviceName;
        this.powerConsumption = powerConsumption;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption(){
        return this.powerConsumption;
    }
}
class SmartBulb extends Device{
    private int brightnessLevel;

    public SmartBulb(String deviceName, int powerConsumption, int brightnessLevel){
        super(deviceName, powerConsumption);
        this.brightnessLevel = brightnessLevel;
    }
    public int getBrightnessLevel(){
        return this.brightnessLevel;
    }

    public void adjustBrightness(int level){
        if(level >= 0 && level <= 100){
            this.brightnessLevel = level;
            System.out.println(getDeviceName() + " brightness level is " + this.brightnessLevel);
        }else{
            System.out.println("Brightness level " + level + " is not in range (0-100)");
        }
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        SmartBulb smartBulb1 = new  SmartBulb("Halonix", 100, 10);
        System.out.println("Device: " + smartBulb1.getDeviceName());
        System.out.println("Power: " + smartBulb1.getPowerConsumption() + "W");
        System.out.println("Initial Brightness: " + smartBulb1.getBrightnessLevel());

        System.out.println("----------------------------------");

        smartBulb1.adjustBrightness(85);
        smartBulb1.adjustBrightness(110);
        smartBulb1.adjustBrightness(15);

        System.out.println("Final Power: " + smartBulb1.getPowerConsumption() + "W");
    }
}
