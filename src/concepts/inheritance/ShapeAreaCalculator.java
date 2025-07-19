package concepts.inheritance;

class Shape{
    public void calculateArea(){
        //Empty method
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea(){
        System.out.println(length*width + " is the area of the rectangle");
    }
}
class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        System.out.println(Math.PI*radius*radius + " is the area of the circle");
    }
}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(23,5);
        rectangle.calculateArea();
        Circle circle = new Circle(5);
        circle.calculateArea();
    }
}
