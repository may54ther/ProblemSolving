import java.util.Arrays;

class Solution {
    public int[] solution(int n, int k) {
        
        int[] answer = new int[n+1];
        
        for (int i = 1; i < n+1; i++) {
            answer[i] = i % k == 0 ? i : 0;
        }
        
        Arrays.sort(answer);
        
        return Arrays
                .stream(answer)
                .filter(x -> x != 0)
                .toArray();
    }
}