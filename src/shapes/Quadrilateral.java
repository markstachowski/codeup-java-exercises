package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // Getters
    public double getArea() {
        System.out.println("in Quadrilateral"); return this.length * this.width; }
    public double getPerimeter() {
        System.out.println("in Quadrilateral"); return 2 * this.length + 2 * this.width; }
    // Abstract Setters
    public abstract void setLength(double length);
    public abstract void setWidth(double width);

}
