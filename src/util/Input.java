package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public Input() {
        sc = new Scanner(System.in);
    }

    public String getString(String input) {
        System.out.println(input);
        return this.sc.nextLine();
    }

    public boolean yesNo(String input) {
        boolean isTrue = false;
        String userInput = getString("Will return true if input is [y/yes]");
        if (userInput.equalsIgnoreCase("y")
                || userInput.equalsIgnoreCase("yes")) {
            isTrue = true;
        }
        return isTrue;
    }


}
