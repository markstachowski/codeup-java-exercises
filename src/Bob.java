import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("What's your name? ");
//        String userName = sc.next();
//                sc.nextLine();
//        System.out.printf("Hi, %s... what did you want? ", userName);
//        String userQuery = sc.nextLine();
//
//        String bobResponse = userQuery.endsWith("?") ? "Sure"
//                : userQuery.endsWith("!") ? "Whoa, chill out!"
//                : userQuery.equals("") ? "Fine. Be that way!"
//                : "Whatever";
//
//        System.out.println(bobResponse);

        do {
            System.out.print("What's your name? ");
            String userName = sc.next();
                    sc.nextLine();
            System.out.printf("Hi, %s... what did you want? ", userName);
            String userQuery = sc.nextLine();

            String bobResponse = userQuery.endsWith("?") ? "Sure"
                    : userQuery.endsWith("!") ? "Whoa, chill out!"
                    : userQuery.equals("") ? "Fine. Be that way!"
                    : "Whatever";

            System.out.println(bobResponse);

            System.out.println("Continue? [y/N]");
        } while (sc.next().equalsIgnoreCase("Y"));
        sc.close();


    }
}
