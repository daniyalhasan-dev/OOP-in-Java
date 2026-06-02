class Shape {
    String color;
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    double length;
    double width;

    Triangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void area(){
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    public void area(){
        double result = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 5);
        t1.area();

        System.out.println("----------------");

        Circle c1 = new Circle(7);
        c1.area();
    }
}
