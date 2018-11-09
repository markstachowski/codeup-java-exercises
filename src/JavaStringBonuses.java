import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class JavaStringBonuses {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter a date (MM/DD/YYYY) in the date format converter application: \n");
        DateFormat parseFormat = new SimpleDateFormat(
                "MM/dd/yyyy");
        String inputDate = sc.nextLine();
        Date date = parseFormat.parse(inputDate);
//        String strDate = parseFormat.format(date); // Checks date entered
//        System.out.println(strDate);  // Prints date entered

        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "MMMM dd, yyyy");
        String stringDate = dateFormat.format(date);
        System.out.println(stringDate);


    }
}
