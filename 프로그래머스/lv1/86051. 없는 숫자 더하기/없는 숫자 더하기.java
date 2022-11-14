class Solution {
    public int solution(int[] numbers) {
        boolean[] checker = new boolean[10];
        int answer = 0;
        
        for (int n : numbers) {
            checker[n] = true;
        }
        for (int i = 0; i < checker.length; i++) {
            if (!checker[i]) {
                answer += i;
            }
        }
        
        return answer;
    }
}