import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while (i >= -10);

//        long i = 2; //change from int to long, so it not all zeros printing out.
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i < 1000000);

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        do {
//            System.out.print("Please enter and integer: ");
//            int inputInt = sc.nextInt();
//            sc.nextLine();
//            System.out.println("Here is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= inputInt; i++) {
//            int squared = (int) Math.pow(i, 2);
//            int cubed = (int) Math.pow(i, 3);
////                System.out.printf("%-6d | %-7d | %-6d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
//                System.out.printf("%-6d | %-7d | %-6d%n", i, squared, cubed);
//            }
//            System.out.println("Continue? [y/N]");
//        } while (sc.next().equalsIgnoreCase("Y"));
//        sc.close();

        boolean userContinues = true;
        do {
            System.out.print("Please enter a number grade from 0 to 100: ");
            int numberGrade = sc.nextInt();
            String letterGrade = numberGrade > 100 ? "Invalid input for grades"
                    : numberGrade >= 88 ? "A"
                    : numberGrade >= 80 ? "B"
                    : numberGrade >= 67 ? "C"
                    : numberGrade >= 60 ? "D"
                    : "F";
            System.out.println(letterGrade);
            System.out.print("Will you continue? Please enter yes or no: ");
            sc.nextLine();
            String answer = sc.next();
            if (!answer.equalsIgnoreCase("yes")) {
                userContinues = false;
            }
        } while (userContinues);

    }
}
