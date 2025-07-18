package concepts.classes_and_objects;

//Dog Bark Simulator

class Dog{
    String name;
    int age;
    String size;

    public Dog(String name, int age, String size){
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public void Bark(){
        if (size.equalsIgnoreCase("small")) {
            System.out.println(name + " barks woof woof!");
        } else if(size.equalsIgnoreCase("medium")) {
            System.out.println(name + " barks groof groof!");
        } else if (size.equalsIgnoreCase("large")) {
            System.out.println(name + " barks bow bow!");
        }
    }

}
public class DogBarkSimulation {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jackie", 2, "small");
        Dog d2 = new Dog("James", 1, "medium");
        Dog d3 = new Dog("Puppy", 3, "large");
        d1.Bark();
        d2.Bark();
        d3.Bark();
    }
}
