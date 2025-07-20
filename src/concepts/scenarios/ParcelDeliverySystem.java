package concepts.scenarios;

class Parcel{
    private int parcelId;
    private double weight;
    private String destination;
    private double charge;

    public Parcel(int parcelId, double weight, double customsFee, String destination) {
        this.parcelId = parcelId;
        this.weight = weight;
        this.destination = destination;
    }

    public int getParcelId() {
        return parcelId;
    }

    public double getWeight() {
        return weight;
    }

    public String getDestination() {
        return destination;
    }

    public void setCharge(double charge) {
        if(charge > 0){
            this.charge = charge;
        }
    }

    public double getCharge() {
        return charge;
    }

    public double calculateTotalCharge(){
        charge = weight * 50;
        return charge;
    }
}
class InternationalParcel extends Parcel{
    private double customsFee;

    public InternationalParcel(int parcelId, double weight, double customsFee, String destination) {
        super(parcelId, weight, customsFee, destination);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    @Override
    public double calculateTotalCharge(){
        double baseCharge = super.calculateTotalCharge();
        return baseCharge + this.customsFee;
    }
}
public class ParcelDeliverySystem {
    public static void main(String[] args) {
        InternationalParcel internationalParcel = new InternationalParcel(1, 45, 7687, "Texas");
        double calculatedCharge = internationalParcel.calculateTotalCharge();
        internationalParcel.setCharge(calculatedCharge);
        System.out.println("Calculated charge is " + internationalParcel.getCharge());
        internationalParcel.calculateTotalCharge();
        internationalParcel.setCharge(1000);
        System.out.println("Manually set charge is: " + internationalParcel.getCharge());
    }
}
