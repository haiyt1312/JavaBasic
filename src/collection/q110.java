package collection;

import java.util.TreeMap;

public class q110 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(1,"H");
        treeMap.put(2,"e");
        treeMap.put(3,"l");
        treeMap.put(4,"l");
        treeMap.put(5,"o");

        System.out.println(treeMap);
        System.out.println("Reverse order view of the keys: " + treeMap.descendingKeySet() + treeMap.descendingMap());
    }
}
