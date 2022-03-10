package shapes;

public class Rectangle extends Quadrilateral{


    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
