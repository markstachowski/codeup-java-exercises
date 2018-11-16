package shapes;

public class Rectangle {

    protected double width;
    protected double length;

    public Rectangle(double recWidth, double recLength) {
        this.length = recWidth;
        this.width = recLength;
    }
    // Setters
    public void setWidth(int width) { this.width = width; }
    public void setLength(int length) { this.length = length; }
    // Getters
    public double getArea() { return length * width; }
    public double getPerimeter() { return 2 * length + 2 * width; }
}


