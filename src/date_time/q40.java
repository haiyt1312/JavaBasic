package date_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class q40 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.print("Ngày hiện tại : ");
//        int date = calendar.get(Calendar.DATE) -1;
//        int year = calendar.get(Calendar.YEAR) +1;
//        System.out.println(date+"-"+calendar.get(Calendar.MONTH) +"-"+year);
        System.out.println(calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.YEAR));
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        System.out.print("Giờ hiện tại : ");
        System.out.println(formatter.format(time));
    }
}
