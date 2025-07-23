package concepts.polymorphism;

abstract class Vehicle{

    abstract void rent();

    abstract void calculateFare(int hours);
}
class Car extends Vehicle{
    private double amount;

    @Override
    void rent() {
        System.out.println("Rented car");
    }

    @Override
    void calculateFare(int hours) {
        if(hours<5){
            amount = 2000 * 5;
            System.out.println("Total fare is "+ amount);
        }else{
            amount = 2000 * 3;
            System.out.println("Total fare is "+ amount);
        }
    }
}
class Bike extends Vehicle{

    private double amount;

    @Override
    void rent() {
        System.out.println("Rented bike");
    }

    @Override
    void calculateFare(int hours) {
        if(hours<5){
            amount = 1500 * 5;
            System.out.println("Total fare is "+ amount);
        }else {
            amount = 1500 * 3;
            System.out.println("Total fare is "+ amount);
        }
    }
}
class Truck extends Vehicle{
    private double amount;

    @Override
    void rent() {
        System.out.println("Rented truck");
    }

    @Override
    void calculateFare(int hours) {
        if(hours<5){
            amount = 3000 * 5;
            System.out.println("Total fare is "+ amount);
        }else  {
            amount = 3000 * 3;
            System.out.println("Total fare is "+ amount);
        }
    }
}
public class VehicleRentalSystem {
    static void rentalSystem(Vehicle vehicle, int hours){
        System.out.println("---------Calculating fare for a " + vehicle.getClass().getSimpleName() + " for " + hours + " hours---------");
        vehicle.rent();
        vehicle.calculateFare(hours);
        System.out.println();
    }

    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();
        rentalSystem(car, 3);
        rentalSystem(bike, 5);
        rentalSystem(truck, 4);
    }
}
