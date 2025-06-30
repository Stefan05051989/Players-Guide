package Com_PlayersGuide_KiersStefan.Utils.TimeAndDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Also, a combination of date and time :
        LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println("Date-Time print : " + dateTime);
        // This version of printing date and time is printed with a Z, but can be formatted to print
        // with a lay-out as you wish, like so :
        // Format time print :
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // Now print the formatted statement :
        String newDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("Date  : " + newDateTime);

        scanner.close();
    }
}
