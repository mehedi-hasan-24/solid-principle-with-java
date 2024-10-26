package ocp.not;

class AreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.width;
        }
        throw new IllegalArgumentException("Unknown shape");
    }
}
