package shapes;

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }
    public double getPerimeter() {
        return 4 * this.length;
    }
    public double getArea() {
        return this.length * this.length;
    }
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}
