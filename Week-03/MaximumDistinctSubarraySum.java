import java.util.HashSet;

public class MaximumDistinctSubarraySum {

    public static long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long maxi = 0;

        int i = 0;
        int j = 0;

        HashSet<Integer> hs = new HashSet<>();

        while ( j < nums.length){
            while(hs.contains(nums[j])){
                hs.remove(nums[i]);
                sum = sum - nums[i];
                i++;
            }
            hs.add(nums[j]);
            sum = sum + nums[j];
            if (j-i+1 < k){
                j++;
            }else if (j-i+1 == k){
                maxi = Math.max(maxi, sum);
                hs.remove(nums[i]);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {

        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        long result = maximumSubarraySum(nums, k);

        System.out.println("Maximum distinct subarray sum = " + result);
    }
}
