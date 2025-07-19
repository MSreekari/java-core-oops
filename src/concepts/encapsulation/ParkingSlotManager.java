package concepts.encapsulation;

class ParkingSlot{
    private int slotNumber;
    private boolean isOccupied;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
    }

    public void occupy(){
        if(!isOccupied){
            isOccupied = true;
            System.out.println("Parking Slot "+slotNumber+" is occupied");
        }
    }

    public void vacate(){
        if(isOccupied){
            isOccupied = false;
            System.out.println("Parking Slot "+ slotNumber +" is vacated");
        }
    }

    public void getSlotNumber() {
        System.out.println("Parking Slot Number "+ slotNumber);
    }

    public void isOccupied(){
        System.out.println("Parking Slot "+ slotNumber +" is occupied: " + isOccupied);
    }
}
public class ParkingSlotManager {
    public static void main(String[] args) {
        ParkingSlot parkingSlot = new ParkingSlot(5);
        parkingSlot.occupy();
        parkingSlot.vacate();
        parkingSlot.getSlotNumber();
        parkingSlot.isOccupied();
    }
}
