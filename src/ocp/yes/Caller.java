package ocp.yes;

public class Caller {
    AreaCalculatorDecider calculator = new AreaCalculatorDecider();

    AreaCalculator circle = new Circle(5);
    AreaCalculator rectangle = new Rectangle(4, 6);
    AreaCalculator triangle = new Triangle(3, 4);


    public void call() {
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Triangle area: " + calculator.calculateArea(triangle));
    }


}
