import java.util.*;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxGroupSize = 0;

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            maxGroupSize = Math.max(maxGroupSize, map.get(sum));
        }

        int count = 0;
        for (int freq : map.values()) {
            if (freq == maxGroupSize) {
                count++;
            }
        }

        return count;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
