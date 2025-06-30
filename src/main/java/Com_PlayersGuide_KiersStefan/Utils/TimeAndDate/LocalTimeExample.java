package Com_PlayersGuide_KiersStefan.Utils.TimeAndDate;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class LocalTimeExample {
    void TimeExample(String[] args) {
        // Print local localDate using the localDate class
        // 1 : Create an object of local localDate, named localDate = acces the class of LocalDate with the "now" method.
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date print : " + localDate);
        // The same is possible with time :
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time print : " + localTime);


        // Also, a combination of date and time :
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date-Time print : " + dateTime);
        // This version of printing date and time is printed with a Z, but can be formatted to print
        // with a lay-out as you wish, like so :
        // Format time print :
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // Now print the formatted statement :
        String newDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("Formatted print : " + newDateTime);


        /*
        Next : UTC timestamp.
        Create an instant object :
        The UTC stands for Coordinated Universal Time (UTC), it is the international timestamp
        since 1972 which is based on the Atomic Clock and coordination of the rotation of the earth.
         */
        Instant instant = Instant.now();
        System.out.println("UTC timestampt print : " + instant);
        System.out.println();

        /*
        Now, Create a custom date / time object :
         */
    }
}
