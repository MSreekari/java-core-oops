package concepts.encapsulation;

class Citizen{
    private String name;
    private int age;

    public Citizen(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        if(age >= 0){
            this.age = age;
            System.out.println("Citizen age is set to " + age);
        }else{
            System.out.println("Age cannot be negative");
        }
    }

    public void canVote(){
        if(age >= 18){
            System.out.println("Citizen can vote.");
        }
    }
}
public class VotingEligibilitySystem {
    public static void main(String[] args) {
        Citizen c1 = new Citizen("Palak", 18);
        c1.setAge(30);
        c1.canVote();
    }
}
