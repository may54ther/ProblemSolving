class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length;
        int[] answer = new int[size];
        
        System.arraycopy(num_list, n, answer, 0, size - n);
        System.arraycopy(num_list, 0, answer, size - n, n);
        
        return answer;
    }
}
