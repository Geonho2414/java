package ch12_practice;

public class Triangle implements Shape {
    private double length;
    private double high;

    public Triangle() {
    }

    public Triangle(double length, double high) {
        this.length = length;
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return (length * high) / 2;
    }
    @Override
    public double calculatePerimeter() {
        return 3 * (length);
    }
}
