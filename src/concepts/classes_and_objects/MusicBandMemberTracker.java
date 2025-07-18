package concepts.classes_and_objects;

import java.util.Arrays;

class BandMember{
    String name;
    String instruments;

    public BandMember(String name, String instruments){
        this.name = name;
        this.instruments = instruments;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Instruments: " + instruments);
    }
}
public class MusicBandMemberTracker {
    public static void main(String[] args) {
        BandMember[] bandMembers = new BandMember[4];
        bandMembers[0] = new BandMember("Kunal", "Guitar");
        bandMembers[1] = new BandMember("Ruchi", "Violin");
        bandMembers[2] = new BandMember("Riya", "Piano");
        bandMembers[3] = new BandMember("Goyal", "Drums");
        System.out.println("-----Band Members-----");
        for (int i = 0; i < bandMembers.length; i++) {
            bandMembers[i].display();
            System.out.println();
        }
    }
}
