import java.util.Scanner;


public class MethodsExercises {

    public static void main(String[] args) {


//        System.out.println(adding(5, 10));
//        System.out.println(subtract(20, 4));
//        System.out.println(multiply(3, 3));
//        System.out.println(divide(40, 6));
//        System.out.println(modulo(8));
//        System.out.println(modulus(6, 4));
//        System.out.println(multiplyLoop(9, 9));
//        System.out.println(factoral(5));
//        System.out.println(factorialRecur(1));
//        System.out.println(factorialT(5));

    }

    public static int adding(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static boolean modulo(int num1) {
        return num1 % 2 == 0;
    }

    public static boolean modulus(int num1, int modNum) {
        return num1 % modNum == 0;
    }

    public static double multiplyLoop(double x, double y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (y > 0) {
            return x + multiplyLoop((int) x, (int) y - 1);
        }
        return -multiplyLoop((int) x, (int) -y);
    }

    public static int multiplyForLoop(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        if (x < 0) {
            return -multiply(-x, y);
        }
        int result = 0;
        for (int i = x; i > 0; i--) {
            result += y;
        }
        return result;
    }


    public static int factoralFor(int num) {
        int i, fact = 1;
        //int number=5;//It is the number to calculate factorial
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
        return i * fact;
    }

    public static long factorialT(int n) {
        if (n < 0) throw new IllegalArgumentException("Can't calculate factorial of negative");
        return (n < 2) ? 1 : n * factorialT(n - 1);
    }

//    public static int factorialRecur(int num) {
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("Enter and integer from 1 to 10: ");
//            int numInput = sc.nextInt();
//            sc.nextLine();
//            System.out.println(numInput);
//            if (numInput == 0)
//                return 1;
//            else
//                return (numInput * factorialRecur(numInput - 1));
//        } catch (NumberFormatException e) {
//            e.getStackTrace();
//        }
//        return 0;



}



