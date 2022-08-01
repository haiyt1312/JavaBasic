package string;

public class q39 {
    public static void check(String x) {
        for (int i = 0; i < x.length(); i++) {
            boolean bl = true;
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(i) == x.charAt(j) && i != j) {
                    bl = false;
                    break;
                }
            }
            if (bl){
                System.out.println("The first non repeated character in String is: " + x.charAt(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        String x = "gibblegabbler";
        System.out.println("The given string is: " + x);
        check(x);
    }
}
