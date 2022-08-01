package collection;

import java.util.LinkedList;

public class q24 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        list.add("H");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");

        for (int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}
