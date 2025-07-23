package concepts.abstraction;

abstract class Shape{

    void draw(){
        System.out.println("---------Shape info loading----------");
    }

    abstract void area();
}
class Circle extends Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        this.area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + this.area);
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    private double area;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    void area(){
        this.area = length * width;
        System.out.println("Area of rectangle is " + this.area);
    }
}
public class ShapeCollector {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        circle.draw();
        circle.area();
        rectangle.draw();
        rectangle.area();
    }
}
