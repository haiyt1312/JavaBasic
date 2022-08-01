package array;

public class q66 {
    public static void check(int[] A) {
        int sum1 = 0, sum2 = -999;
        for (int i = 0; i < A.length; i++) {
            sum1 += A[i];

            if (sum1<0){
                sum1 = 0;
            }

            sum2 = Math.max(sum1, sum2);
        }

        System.out.println("The largest sum of contiguous sub-array: " + sum2);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9};
        check(A);
    }
}
