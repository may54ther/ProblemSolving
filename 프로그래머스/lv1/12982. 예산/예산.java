import java.util.Arrays;

class Solution {
    public int solution(int[] dept, int budget) {
        int answer = 0;
        
        Arrays.sort(dept);
        for (int d : dept) {
            if (budget < d || budget == 0) break;
            else {
                budget -= d;
                answer++;
            }
        }
        
        return answer;
    }
}