import java.util.*;

public class FirstNegativeInWindow {

    public static List<Integer> firstNegInt(int arr[], int k) {

        int i = 0;
        int j = 0;

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        while (j < arr.length) {

            // Add negative element to queue
            if (arr[j] < 0) {
                q.add(arr[j]);
            }

            // Window size less than k
            if (j - i + 1 < k) {
                j++;
            }

            // Window size equal to k
            else if (j - i + 1 == k) {

                // If no negative element
                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(q.peek());

                    // Remove element leaving window
                    if (arr[i] == q.peek()) {
                        q.poll();
                    }
                }

                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {-8, 2, 3, -6, 10};
        int k = 2;

        List<Integer> result = firstNegInt(arr, k);

        System.out.println("Output: " + result);
    }
}
