class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each number
        for (int i = 0; i < nums.length; i++) {
            // For each number, check the next numbers
            for (int j = i + 1; j < nums.length; j++) {
                // If they add up to the target, return their indexes
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        // Just in case, though problem guarantees a solution
        return new int[] {};
    }
}
