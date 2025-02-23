class Solution {
    public int[] solution(int n) {
        int size = (int)Math.round(n / 2.0);
        int[] answer = new int[size];
        for(int i = 0; i < size; i++){
            if(i==0) answer[i] = 1;
            else answer[i] = answer[i-1] + 2;
        }
        
        return answer;
    }
}