package concepts.polymorphism;

class Billing{
    private String name;
    private double price;
    private String description;

    public Billing(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void calculateBill(double price){
        System.out.println("The total bill is: " + price);
    }

    public void calculateBill(double price, double discount){
        price = price * discount;
        System.out.println("The total bill with discount is: " + price);
    }

    public void calculateBill(double price, double discount, double tax){
        price = (price * discount) + tax;
        System.out.println("The total bill with discount and tax is: " + price);
    }
}
public class BillingSystem {
    public static void main(String[] args) {
        Billing bill = new Billing("Palak", 38576, "Bought an item");
        bill.calculateBill(38576);
        bill.calculateBill(38576, 0.3);
        bill.calculateBill(38576, 30, 400);
    }
}
