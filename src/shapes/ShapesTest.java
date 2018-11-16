package shapes;

public class ShapesTest {

    public static void main(String[] args) {
// Parent:
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Box1 perimeter is: " + box1.getPerimeter());
        System.out.println("Box1 area is: " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("Box2 perimeter is: " + box2.getPerimeter());
        System.out.println("Box2 area is: " + box2.getArea());
// Child:
        Square box3 = new Square(4);
        System.out.println("Box3 perimeter is: " + box3.getPerimeter());
        System.out.println("Box3 area is: " + box3.getArea());

        Square box4 = new Square(5);
        System.out.println("Box4 perimeter is: " + box4.getPerimeter());
        System.out.println("Box4 area is: " + box4.getArea());

    }

}
