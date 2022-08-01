package method;

import java.util.ArrayList;
import java.util.List;

public class q7 {
    public static void main(String[] args) {
        int num;
        System.out.println("50 số ngũ giác đầu tiên: ");
        for (int i = 1; i <= 50; i++) {
            num = (i * (3 * i - 1)) / 2;
            System.out.print(num + " ");
        }
    }
}
