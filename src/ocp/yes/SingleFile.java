package ocp.yes;

public class SingleFile {
}

// Step 1: Define an interface for calculating area
interface AreaCalculable1 {
    double calculateArea();
}

// Step 2: Create Shape classes that implement the AreaCalculable1 interface

class Circle1 implements AreaCalculable1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 implements AreaCalculable1 {
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Step 3: AreaCalculator can now work with any shape that implements AreaCalculable1
class AreaCalculator1 {
    public double calculateArea(AreaCalculable1 shape) {
        return shape.calculateArea();
    }
}



//Came another Shape??? That is how you will extend your feature
class Triangle1 implements AreaCalculable1 {
    private double base;
    private double height;

    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
