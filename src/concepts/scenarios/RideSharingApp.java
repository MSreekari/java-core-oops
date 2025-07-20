package concepts.scenarios;

class Profile{
    private String name;
    private double rating;

    public Profile(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    protected void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
}
class Driver extends Profile{
    private int numberOfRides;

    public Driver(String name, double rating, int numberOfRides) {
        super(name, rating);
        this.numberOfRides = numberOfRides;
    }

    public int getNumberOfRides() {
        return numberOfRides;
    }

    public void completedRide(double rating){
        double currentTotalRating = getRating() * this.getRating();
        numberOfRides++;
        double newRating = (currentTotalRating + rating) / this.numberOfRides;
        setRating(newRating);
    }

    public boolean isEligibleBonus(){
        return getRating() >= 4.5 && numberOfRides >= 100;
    }
}
public class RideSharingApp {
    public static void main(String[] args) {
        Driver driver = new Driver("Goyal", 4, 20);
        System.out.println("Driver Name: " + driver.getName());
        System.out.println("Driver Rating: " + driver.getRating());
        System.out.println("Driver number of rides: " + driver.getNumberOfRides());
        System.out.println("Driver " + driver.getName() + " eligible for bonus: " + driver.isEligibleBonus());
        System.out.println("------------------------------");
        System.out.println("Driver " + driver.getName() + " completed a new ride.");
        driver.completedRide(driver.getRating());
        System.out.println("Driver New Rating: " + driver.getRating());
        System.out.println("Driver new number of rides: " + driver.getNumberOfRides());
        System.out.println("Driver " + driver.getName() + " eligible for bonus: " + driver.isEligibleBonus());
    }
}
