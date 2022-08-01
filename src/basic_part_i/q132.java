package basic_part_i;

import java.util.Arrays;

public class q132 {
    static int remove_Duplicates(int[] arr) {
        int index = 1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[index] || (arr[i] == arr[index] && arr[i] != arr[index - 1])) {
                index++;
                arr[index] = arr[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("The length of the original array is: " + arr.length);
        System.out.println("After removing duplicates, the new length of the array is: " + remove_Duplicates(arr));
    }
}
