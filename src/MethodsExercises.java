public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(adding(5, 10));
        System.out.println(subtract(20, 4));
        System.out.println(multiply(3, 3));
        System.out.println(divide(40, 6));
        System.out.println(modulo(8));
        System.out.println(modulus(6, 4));

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

    

}