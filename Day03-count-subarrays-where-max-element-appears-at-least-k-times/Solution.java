class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        long count = 0;
        int left = 0;
        int maxCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == maxVal) {
                maxCount++;
            }

            while (maxCount >= k) {
                // From 'left' to end of array are all valid subarrays
                count += nums.length - right;
                if (nums[left] == maxVal) {
                    maxCount--;
                }
                left++;
            }
        }

        return count;
    }
}
