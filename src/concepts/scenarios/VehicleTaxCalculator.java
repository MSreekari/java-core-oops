package concepts.scenarios;

class Vehicle{
    private String model;
    private double price;

    public Vehicle(String model, double price){
        this.model = model;
        this.price = price;
    }

    public String getModel(){
        return model;
    }

    public double getPrice(){
        return price;
    }
}
class Car extends Vehicle{
    private double tax;

    public Car(String model, double price){
        super(model, price);
    }

    public void claculateTax(){
        if(getPrice() > 1000000){
            this.tax = (getPrice() * ((double) 18 /100));
            System.out.println("Tax for " + getModel() + " is " + " $" + tax);
        }else{
            this.tax = (getPrice() * ((double) 8 /100));
            System.out.println("Tax for " + getModel() + " is " +" $" + tax);
        }
    }
}
public class VehicleTaxCalculator {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 5000000);
        car1.claculateTax();
        Car car2 = new Car("Bugatti", 200000);
        car2.claculateTax();
    }
}
