package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double area() {
        return (Math.PI * (radius * radius));
    }

    public double circumference() {
        return Math.PI * (radius * 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
