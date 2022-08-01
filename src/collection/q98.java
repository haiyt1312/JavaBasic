package collection;

import java.util.HashMap;

public class q98 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1,"H");
        hashMap.put(2,"e");
        hashMap.put(3,"l");
        hashMap.put(4,"l");
        hashMap.put(5,"o");

        String val = (String) hashMap.get(1);

        System.out.println(hashMap);
        System.out.println("Value for key 1 is: " + val);
    }
}
