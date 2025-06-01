import java.util.*;

class Solution {
    private List<int[]> movedList = new ArrayList<>();
    
    public int[][] solution(int n) {
        hanoi(n, 1, 2, 3);
        return movedList.toArray(int[][]::new);
    }
    
    public void hanoi(int n, int from, int by, int to) {
        if (n == 1) {
            movedList.add(new int[]{from, to});
            return;
        }
        hanoi(n - 1, from, to, by);
        movedList.add(new int[]{from, to});
        hanoi(n - 1, by, from, to);
    }
}