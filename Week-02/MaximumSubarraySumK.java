public class MaximumSubarraySumK {

    public static int maxSubarraySum(int[] arr, int k) {

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;

        while (j < arr.length) {

            // Add current element to window
            sum += arr[j];

            // When window size is less than k, expand window
            if (j - i + 1 < k) {
                j++;
            }

            // When window size becomes exactly k
            else if (j - i + 1 == k) {

                // Update maximum sum
                maxi = Math.max(maxi, sum);

                // Slide window: remove left element
                sum = sum - arr[i];

                i++;
                j++;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSubarraySum(arr, k);

        System.out.println("Maximum subarray sum of size " + k + " is: " + result);
    }
}
