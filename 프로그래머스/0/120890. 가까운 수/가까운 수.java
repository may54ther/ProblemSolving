import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        PriorityQueue<int[]> pQueue = new PriorityQueue<>((a, b) -> {
            return (a[1] == b[1]) ? a[0] - b[0] : a[1] - b[1];
        });

        for (int item : array) {
            int distance = Math.abs(n - item);
            pQueue.offer(new int[]{item, distance});
        }     
        
        return pQueue.poll()[0];
    }
}