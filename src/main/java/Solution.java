import java.util.Arrays;

public class Solution {
    public int distributeCookies(int[] cookies, int k) {

        return dfs(cookies, new int[k], 0);
    }

    private int dfs(int[] cookies, int[] children, int i) {
        if (i == cookies.length) {

            int max = Integer.MIN_VALUE;
            for (int j = 0; j < children.length; j++) {
                if (children[j] > max) {
                    max = children[j];
                }
            }

            return max;
        }

        int result = Integer.MAX_VALUE;

        for (int j = 0; j < children.length; j++) {
            children[j] += cookies[i];
            result = Math.min(result, dfs(cookies, children, i + 1));
            children[j] -= cookies[i];
        }

        return result;
    }
}
