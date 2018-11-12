import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//random number generation using Random Class
        Random randomNumbers = new Random();
        int randNums = randomNumbers.nextInt((100 - 1) + 1) + 1;
        System.out.printf("Game generated random number is: %d%n", randNums);
        System.out.println("-----------------------------------\n");

        boolean userContinues = true;
        int guesses = 0;
        int lives = 10;

        try {
            System.out.println("You have 10 chances to guess... Good luck!\n");

            do {
                System.out.println("\nGuess a number 1 to 100: \n");
                int userGuess = sc.nextInt();

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please guess a number from 1 to 100...");
                } else if (userGuess > randNums) {
                    System.out.println("Guess Lower!\n");
                } else if (userGuess < randNums) {
                    System.out.println("Guess Higher!\n");
                } else if (userGuess == randNums) {
                    System.out.println("Got it, good guess!\n");
                    userContinues = false;
                } else if (lives == 0) {
                    System.out.println("User is out of lives... GAME OVER!\n");
                    userContinues = false;
                }
                guesses++;
                lives--;
                System.out.printf("Users guesses: %d%n", guesses);
                System.out.printf("User lives remaining: %d%n", lives);
            } while (userContinues);

        } catch (NumberFormatException e) {
            e.printStackTrace(); // This goes to System.err
            e.printStackTrace(System.out);
            // Prints what exception has been thrown
            System.out.println(e);

        } finally {
            sc.close(); //method closes the Scanner
        }
    }
}
