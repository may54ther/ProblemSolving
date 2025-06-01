class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
            
        for (int number : numbers) {
            answer += number;
            if (n < answer) break;
        }
        
        return answer;
    }
}