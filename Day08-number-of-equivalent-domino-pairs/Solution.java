import java.util.Map;
import java.util.HashMap;
public class Solution {
    

public int numEquivDominoPairs(int[][] dominoes) {
    Map<String, Integer> map = new HashMap<>();
    int count = 0;

    for (int[] domino : dominoes) {
        int a = domino[0];
        int b = domino[1];
        String key = a < b ? a + "," + b : b + "," + a;  // normalize order

        count += map.getOrDefault(key, 0);  // add how many we've seen so far
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    return count;
}

// Test
public static void main(String[] args) {
    Solution dp = new Solution();
    
    int[][] dominoes1 = {{1,2},{2,1},{3,4},{5,6}};
    System.out.println(dp.numEquivDominoPairs(dominoes1));  // Output: 1

    int[][] dominoes2 = {{1,2},{1,2},{1,1},{1,2},{2,2}};
    System.out.println(dp.numEquivDominoPairs(dominoes2));  // Output: 3
}
}