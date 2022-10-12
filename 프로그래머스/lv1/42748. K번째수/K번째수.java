import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int index = 0;
        
        int[] answer = new int[size];
        
        for(int[] c : commands) {
            int[] temp = Arrays.copyOfRange(array,  c[0]-1, c[1]);
            Arrays.sort(temp);
            
            answer[index++] = temp[c[2]-1];
        }
        
        return answer;
    }
}