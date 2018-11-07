public class HelloWorld {
    public static void main (String[] args) {
//        System.out.println("Hello, World!");

        int myFavoriteNumber = 8;
//        System.out.println(myFavoriteNumber);

        String myString = "Mark is my String";
//        System.out.println(myString);

//        char ch = myString;
//
//        myString = 3.14159;

        long myNumber = 123L;
//        System.out.println(myNumber);

        float myNumberFloat = (float) myNumber;
        System.out.println(myNumberFloat);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";

        int x = 4;
        x += 5;
//        System.out.println(x);

        int a = 3;
        int b = 4;
        b *= a;
//        System.out.println(b);

        int c = 10;
        int d = 2;
//        c /= d;
//        System.out.println(c);
        d -= c;
//        System.out.println(d);

        int myInteger = 900;
        long morePrecise = myInteger;
        System.out.println(morePrecise);

        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(almostPi);
    }
}
