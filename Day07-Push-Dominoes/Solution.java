 public class Solution {


    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] forces = new int[n];

        // Left to Right pass
        int force = 0;
        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) == 'R') {
                force = n; // max force
            } else if (dominoes.charAt(i) == 'L') {
                force = 0;
            } else if (force > 0) {
                force--;
            }
            forces[i] += force;
        }

        // Right to Left pass
        force = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') {
                force = n;
            } else if (dominoes.charAt(i) == 'R') {
                force = 0;
            } else if (force > 0) {
                force--;
            }
            forces[i] -= force;
        }

        // Build final result
        StringBuilder result = new StringBuilder();
        for (int f : forces) {
            if (f > 0) result.append('R');
            else if (f < 0) result.append('L');
            else result.append('.');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution pd = new Solution();
        String dominoes = ".L.R...LR..L..";
        System.out.println(pd.pushDominoes(dominoes));  // Output: "LL.RR.LLRRLL.."
    }
}
 
