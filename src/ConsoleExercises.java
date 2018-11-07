import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {

        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        System.out.println("Enter a number: ");
//        int userInt = sc.nextInt();
//        System.out.println("Your number is:" + userInt);

//        System.out.println("Enter 3 words to store in 3 variables: ");
//        String input1 = sc.next();
//        String input2 = sc.next();
//        String input3 = sc.next();
//        System.out.println("Your 3 words are: " + input1 + " " + input2 + " " + input3);

//        System.out.println("Write a sentence on something you like...");
//        String inputSentence = sc.nextLine();
//        System.out.println("Your sentence says: " + inputSentence);

        System.out.println("Enter values of length and width of a classroom at Codeup: ");
        System.out.print("Enter the length of the classroom: ");
        float length = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter the width of the classroom: ");
        float width = sc.nextFloat();
        float perimeter = (length * 2) + (width * 2);
//        System.out.print("The classroom perimeter is: " + perimeter +" total area");
        System.out.format("The perimeter of the classroom is %.2f %n", perimeter);
        System.out.print("Enter the volume of the classroom: ");
        float volume = sc.nextFloat();
        float totalArea = length * width * volume;
        sc.nextLine();
//        System.out.println("The total area is: " + totalArea);
        System.out.format("The total area of the classroom is %.2f", totalArea);

    }
}
