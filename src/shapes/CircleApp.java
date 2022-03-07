package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("what is the radius of the circle?  ");
        Circle myCircle = new Circle(input.getDouble());
        System.out.println("The area: " + myCircle.area());
        System.out.println("The perimeter: " + myCircle.circumference());

    }
}
