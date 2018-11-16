package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }

//    public Square(double side) {
//        super(side, side);
//    }
//    // Setters
//    public void setLength(double length) {
//        this.length = length;
//        this.width = length;
//    }
//    public void setWidth(double width) {
//        this.length = width;
//        this.width = width;
//    }
//    // Getters
//    @Override public double getPerimeter() {
//        System.out.println("in Square"); return 4 * this.length; }
//    @Override public double getArea() {
//        System.out.println("in Square");return this.length * this.length; }
}
