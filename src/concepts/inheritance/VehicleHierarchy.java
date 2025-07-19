package concepts.inheritance;

class Vehicle{
    private double speed;
    private double fuel;

    public Vehicle(double speed, double fuel){
        this.speed = speed;
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed > 0){
            this.speed = speed;
            System.out.println("Speed: " + this.speed);
        }else{
            System.out.println("Speed has to be greater than 0");
        }
    }

    public double getFuel() {
        return fuel;
    }

    public void drive(){
        System.out.println("Current Speed: " + this.speed);
    }
}
class Car extends Vehicle{
    boolean acMode;

    public Car(double speed, double fuel, boolean acMode){
        super(speed, fuel);
        this.acMode = acMode;
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("AcMode: " + this.acMode);
    }
}
class Bike extends Vehicle{
    boolean helmetOn;

    public Bike(double speed, double fuel, boolean helmetOn){
        super(speed, fuel);
        this.helmetOn = helmetOn;
    }

    public boolean isHelmetOn() {
        return helmetOn;
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Helmet On: " + this.helmetOn);
    }
}
public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car(46.45, 57, true);
        car.drive();
        Bike bike = new Bike(23,6,false);
        bike.drive();
    }
}
