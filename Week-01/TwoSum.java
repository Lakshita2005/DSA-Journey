// Brute Force Approach
// T.C: O(n2)
// S.C: O(1)
// public class TwoSum {
//     public static int[] twoSum(int[] nums, int target) {
//         int[] ans = new int[2];

//         for(int i = 0; i < nums.length; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     ans[0] = i;
//                     ans[1] = j;
//                     return ans;
//                 }
//             }
//         }
//         return ans; // guaranteed one solution as per problem
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = twoSum(nums, target);
//         System.out.println(result[0] + ", " + result[1]);
//     }
// }


//Optimized Approach Using HashMap
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}
