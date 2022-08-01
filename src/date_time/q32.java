package date_time;

import java.util.Calendar;
import java.util.Scanner;

public class q32 {
    public static void main(String[] args) {
        int namSinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm sinh: ");
        namSinh = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        int tuoi = calendar.get(Calendar.YEAR) - namSinh;

        System.out.println("Năm nay bạn " + tuoi + " tuổi");
    }
}
