package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;
        myShape = new Rectangle(4.0, 5.0);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(4.0);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        ((Square) myShape).getLength();

//                Quadrilateral box1 = new Rectangle(4,5);
//                System.out.println(box1.getPerimeter());
//                System.out.println(box1.getArea());
//
//                Quadrilateral box2 = new Square(5);
//                System.out.println(box2.getPerimeter());
//                System.out.println(box2.getArea());
//                Measurable myShape = new Rectangle(5, 4.0001);
//                System.out.println(myShape.getPerimeter());
//                System.out.println(myShape.getArea());
//                ((Rectangle) myShape).setLength(6.2);
//                System.out.println(myShape.getPerimeter());
//                System.out.println(myShape.getArea());
//
//                myShape = new Square(4.0001);
//                System.out.println(myShape.getPerimeter());
//                System.out.println(myShape.getArea());
//                ((Square) myShape).setLength(6.2);
//                System.out.println(myShape.getPerimeter());
//                System.out.println(myShape.getArea());

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());


// Parent Rectangle Class:
        // uses Parent methods getPerimeter and getArea.
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("Box1 perimeter is: " + box1.getPerimeter());
//        System.out.println("Box1 area is: " + box1.getArea());
// Child Square extends Rectangle Class:
        // uses "Override" Child methods getPerimeter and getArea.
//        Rectangle box2 = new Square(5);
//        System.out.println("Box2 perimeter is: " + box2.getPerimeter());
//        System.out.println("Box2 area is: " + box2.getArea());
// Child Square Class:
//        Square box3 = new Square(4);
//        System.out.println("Box3 perimeter is: " + box3.getPerimeter());
//        System.out.println("Box3 area is: " + box3.getArea());
//
//        Square box4 = new Square(5);
//        System.out.println("Box4 perimeter is: " + box4.getPerimeter());
//        System.out.println("Box4 area is: " + box4.getArea());

    }

}
