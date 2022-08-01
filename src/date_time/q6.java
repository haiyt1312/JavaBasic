package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q6 {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String dateTime = current.format(formatter);
        System.out.println("Ngày giờ hiện tại: " + dateTime);
    }
}
