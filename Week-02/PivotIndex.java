// public class PivotIndex {
//     public static int pivotIndex(int[] nums) {
//         int n = nums.length;

//         int[] prefix_sum = new int[n];
//         int[] suffix_sum = new int[n];

//         // Prefix sums
//         prefix_sum[0] = 0;
//         for (int i = 1; i < n; i++) {
//             prefix_sum[i] = prefix_sum[i - 1] + nums[i - 1];
//         }

//         // Suffix sums
//         suffix_sum[n - 1] = 0;
//         for (int i = n - 2; i >= 0; i--) {
//             suffix_sum[i] = suffix_sum[i + 1] + nums[i + 1];
//         }

//         // Find pivot
//         for (int i = 0; i < n; i++) {
//             if (prefix_sum[i] == suffix_sum[i]) {
//                 return i;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 7, 3, 6, 5, 6};
//         System.out.println("Pivot Index = " + pivotIndex(nums));
//     }
// }

// Optimized approach
public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot Index = " + pivotIndex(nums));
    }
}
