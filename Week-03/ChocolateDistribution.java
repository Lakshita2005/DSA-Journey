import java.util.*;

public class ChocolateDistribution {

    public static int findMinDiff(int[] arr, int m) {

        Arrays.sort(arr);

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {

            int diff = arr[i + m - 1] - arr[i];

            mini = Math.min(mini, diff);
        }

        return mini;
    }

    public static void main(String[] args) {

        int[] arr = {3,4,1,9,56,7,9,12};
        int m = 5;

        System.out.println(findMinDiff(arr, m));
    }
}
