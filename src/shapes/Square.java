package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    } //use super if extends to something
    public void setLength(double length) { this.length = length; this.width = length; }
    public void setWidth(double width) { this.length = width; this.width = width; }

// Getters
    @Override public double getPerimeter() {
        System.out.println("in Square"); return 4 * this.length; }
    @Override public double getArea() {
        System.out.println("in Square");return this.length * this.length; }

    @Override
    public double getLength() {
        System.out.println("override from square");
        return super.getLength();
    }
    @Override
    public double getWidth() {
        System.out.println("override from square");
        return super.getWidth();
    }

    // Commented out old version:
//    public Square(double side) {
//        super(side, side);
//    }
// Setters
//    public void setLength(double length) {
//        this.length = length;
//        this.width = length;
//    }
//    public void setWidth(double width) {
//        this.length = width;
//        this.width = width;
//    }
}
