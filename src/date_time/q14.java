package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class q14 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        System.out.println(formatter.format(time));
    }
}
