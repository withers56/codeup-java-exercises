package shapes;

class Square extends Quadrilateral implements Measurable{


    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return this.length * this.length;
    }

    public double getPerimeter() {
        return this.length * 4;
    }
}
