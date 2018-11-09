import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaStringBonuses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Date date = null;
        try {
            System.out.println("\nEnter a date (MM/DD/YYYY) in the date format converter application:\n");
            DateFormat parseFormat = new SimpleDateFormat(
                    "MM/dd/yyyy");
            String inputDate = sc.nextLine();
            date = parseFormat.parse(inputDate);
            if (!inputDate.equals(parseFormat.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace(); // NonCompliant, security risk... Default Stream in System.Err
        }
        if (date == null) {
            System.out.println("Invalid date format, use (MM/DD/YYYY)");
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat(
                    "MMMM dd, yyyy");
            String stringDate = dateFormat.format(date);
            System.out.format("%s is a Valid date format", stringDate);
        }

    }
}
