
// Problem: LeetCode 1 - Two Sum
// Approach: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Learning: Must check all index pairs, not just adjacent ones
import java.util.HashMap;

public class two_Sum_LC1 {
    public static void main(String args[]) {
        int nums[] = {  7, 11, 15 };
        int target = 18;
        // int result[] = twoSum(nums, target);
        int result[] = hashtwoSum(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };
    }

    // using hashmap optimization
    static int[] hashtwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}
