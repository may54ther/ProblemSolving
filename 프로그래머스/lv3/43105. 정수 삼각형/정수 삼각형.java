import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int N = triangle.length;
        int[][] dp = new int[N][N];
        int sum = 0;
        
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < triangle[x].length; y++) {
                int y2 = y;

                dp[x][y] = triangle[x][y];
                
                if (x > 0) {
                    if (y > 0) y2 = y - 1;
                    dp[x][y] += Math.max(dp[x - 1][y2], dp[x - 1][y]);
                }
                
                if (x == N - 1)
                    sum = Math.max(dp[x][y], sum);
            }
        }
        
        return sum;
    }
}