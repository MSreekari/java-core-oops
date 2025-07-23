package concepts.abstraction;

interface Vehicle{

    abstract void drive();
}
abstract class ElectricVehicle{
    abstract void charge();

    abstract void batteryLeft();
}
class Tesla extends ElectricVehicle implements Vehicle{

    @Override
    public void charge() {
        System.out.println("Charging Tesla");
    }

    @Override
    public void batteryLeft() {
        System.out.println("Battery Left Tesla");
    }

    @Override
    public void drive() {
        System.out.println("Driving Tesla");
    }
}
class NexonEV extends ElectricVehicle implements Vehicle{
    @Override
    public void charge() {
        System.out.println("Charging NexonEV");
    }

    @Override
    public void batteryLeft() {
        System.out.println("Battery Left NexonEV");
    }

    @Override
    public void drive() {
        System.out.println("Driving NexonEV");
    }
}
public class EVehicle{
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        NexonEV nextEv = new NexonEV();
        tesla.drive();
        tesla.charge();
        tesla.batteryLeft();
        System.out.println("------------------------");
        nextEv.drive();
        nextEv.charge();
        nextEv.batteryLeft();
    }
}
