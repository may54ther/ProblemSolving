class Solution {
    public int[] solution(int[] num_list) {
        int i = num_list.length;
        
        int[] answer = new int[i];
        for(int num : num_list){
            answer[--i] = num;
        }
        
        return answer;
    }
}