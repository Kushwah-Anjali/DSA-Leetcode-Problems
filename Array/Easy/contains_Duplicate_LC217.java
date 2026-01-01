import java.util.HashMap;

public class contains_Duplicate_LC217 {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3 };
        System.out.println(duplicate(nums));
    }

    static boolean duplicate(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
