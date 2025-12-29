// Problem: LeetCode 1 - Two Sum
// Approach: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Learning: Must check all index pairs, not just adjacent ones

public class two_Sum_LC1 {
    public static void main(String args[]) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 8;
        int result[] = twoSum(nums, target);
       for(int i: result){
        System.out.print(i+" ");
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
}
