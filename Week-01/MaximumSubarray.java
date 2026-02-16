public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum = " + maxSubArray(nums));
    }
}
