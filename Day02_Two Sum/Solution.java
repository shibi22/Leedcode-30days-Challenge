import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store (value, index) pairs
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            // If complement exists in map, we've found the answer
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store current value with its index
            map.put(current, i);
        }

        // If no solution found (as per constraint, this shouldn't happen)
        return new int[] {};
    }
}
