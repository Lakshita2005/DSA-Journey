class RunningSum_1480{
    public static int[] runningSum(int[] nums) {
        int[] running_sum = new int[nums.length];
        running_sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            running_sum[i] = running_sum[i - 1] + nums[i];
        }
        return running_sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
