package concepts.inheritance;

class Animal{
    public void makeSound(){
        System.out.println("Some Sound");
    }
}
class Dog  extends Animal{
    public void makeSound(){
        System.out.println("Dog says Woof!");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat says Meow!");
    }
}
public class AnimalKingdom {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}
