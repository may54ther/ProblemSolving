import java.util.*;

class Solution {
    
    public int solution(int m, int n, int[][] puddles) {
        
        int[][] map = new int[n][m];
        
        for(int[] puddle : puddles) {
            int x = puddle[1]-1;
            int y = puddle[0]-1;
            
            map[x][y] = -1;
        }
       
        for(int i = 1; i < n; i++){
            if(map[i][0] > -1) {
                map[i][0] = map[i-1][0] > -1 ? 1 : -1;
            }
         
            for(int j = 1; j < m; j++){
                if(map[i][j] > -1) {
                    if(map[0][j] > -1) {
                      map[0][j] = map[0][j-1] > -1 ? 1 : -1;
                    }
                    map[i][j] = (Math.max(0, map[i][j-1]) + Math.max(0, map[i-1][j])) % 1000000007;
                    
                }
            }
        }
        
        return map[n-1][m-1];
    }
}