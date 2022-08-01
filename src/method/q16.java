package method;

import java.util.ArrayList;

public class q16 {
    public static boolean checkSoNgTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (checkSoNgTo(i) && checkSoNgTo(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }
}
