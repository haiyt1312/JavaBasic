package string;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class q15 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date and Time :");
        System.out.println(calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.YEAR));
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        System.out.println(formatter.format(time));
    }
}
