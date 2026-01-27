// Using Hashmap
// T.C: O(n)
// S.C: O(n)
// import java.util.HashMap;
// public class ContainsDuplicate {

//     public static boolean containsDuplicate(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             if (map.containsKey(nums[i])) {
//                 return true; // duplicate found
//             } else {
//                 map.put(nums[i], 1);
//             }
//         }

//         return false; // no duplicates
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 1};
//         System.out.println(containsDuplicate(nums)); // true
//     }
// }


// Using Hashset
// T.C: O(n)
// S.C: O(n)
import java.util.HashSet;
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums)); // false
    }
}
