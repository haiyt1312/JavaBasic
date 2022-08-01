package collection;

import java.util.LinkedList;

public class q27 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        list.add("H");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");

        list.add(5,"!!!");
        for (int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
        }
    }
}
