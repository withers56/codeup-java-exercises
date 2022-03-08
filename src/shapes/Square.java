package shapes;

public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super(side, side);

        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    //accessors

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }
}
