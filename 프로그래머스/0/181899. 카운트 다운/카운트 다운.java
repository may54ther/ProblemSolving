class Solution {
    public int[] solution(int start_num, int end_num) {
        int size = start_num - end_num;
        int[] answer = new int[size + 1];
        
        for (int i = 0; i <= size; i++) {
            answer[i] = start_num--;
        }
        
        return answer;
    }
}