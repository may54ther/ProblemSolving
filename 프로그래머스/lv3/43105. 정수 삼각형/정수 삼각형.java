import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int N = triangle.length;
        for (int x = 1; x < N; x++) {
            triangle[x][0] += triangle[x-1][0]; 
            triangle[x][x] += triangle[x-1][x-1];
            
            for (int y = 1; y < x; y++) {
                triangle[x][y] += Math.max(triangle[x-1][y-1], triangle[x-1][y]);
            }
        }
        
        return Arrays.stream(triangle[N-1]).max().getAsInt();
    }
}