package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }

//    protected double width;
//    protected double length;
//// Originally built with recLength first and recWidth second, but instructions say switch them for output to match.
//    public Rectangle(double recWidth, double recLength) {
//        this.length = recWidth;
//        this.width = recLength;
//    }
//    // Setters
//    public void setLength(double length) { this.length = length; }
//    public void setWidth(double width) { this.width = width; }
//    // Getters
//    public double getArea() {
//        System.out.println("in Rectangle"); return this.length * this.width; }
//    public double getPerimeter() {
//        System.out.println("in Rectangle"); return 2 * this.length + 2 * this.width; }
}


