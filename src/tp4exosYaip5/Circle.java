package tp4exosYaip5;

public class Circle {
    double radius;
    String color;

    public Circle() {
        radius = 1.0;
        color = "purple";
    }

    public Circle(double r) {
        radius = r;
        color = "purple"; 
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}