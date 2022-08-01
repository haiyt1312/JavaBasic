package date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q24 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Default format of LocalDate= " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Default format of LocalDateTime= " + localDateTime);

        Instant timestamp = Instant.now();
        System.out.println("Default format of Instant= "+timestamp);

        LocalDateTime dateTime = LocalDateTime.parse("28::Jul::2022 00::11::22",DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing = "+ dateTime);
    }
}
