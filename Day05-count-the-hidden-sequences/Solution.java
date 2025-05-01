class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long minPrefix = 0, maxPrefix = 0, current = 0;

        for (int diff : differences) {
            current += diff;
            minPrefix = Math.min(minPrefix, current);
            maxPrefix = Math.max(maxPrefix, current);
        }

        long validLower = Math.max(lower, lower - minPrefix);
        long validUpper = Math.min(upper, upper - maxPrefix);

        if (validLower > validUpper) {
            return 0;
        }

        return (int)(validUpper - validLower + 1);
    }
}
