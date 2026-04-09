interface Shape {
    void draw();   
    void area();
}
class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public void draw() {
        System.out.println("Drawing Circle");
    }
    public void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }
}
class Rectangle implements Shape {
    double l;
    double b;
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    public void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}
public class abstr1{
    public static void main(String[] args) {
        Shape s;
        s = new Circle(5);
        s.draw();
        s.area();
        s = new Rectangle(4, 6);
        s.draw();
        s.area();
    }
}