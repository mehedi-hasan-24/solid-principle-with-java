package ocp.not;

public class SingleFile {
}
// Base class for shapes
class Shape1 {
    // Can be empty or have common attributes, e.g., color, outline, etc.
}

class Circle1 extends Shape1 {
    public double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }
}

class Rectangle1 extends Shape1 {
    public double length;
    public double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

// AreaCalculator checks the type of shape using instanceof (violating OCP)
class AreaCalculator1 {
    public double calculateArea(Shape1 shape) {
        if (shape instanceof Circle1) {
            Circle1 circle = (Circle1) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle1) {
            Rectangle1 rectangle = (Rectangle1) shape;
            return rectangle.length * rectangle.width;
        }
        throw new IllegalArgumentException("Unknown shape");
    }
}
