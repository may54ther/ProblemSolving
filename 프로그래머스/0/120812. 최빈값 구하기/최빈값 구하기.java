import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        int max = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: array){
            int count = map.getOrDefault(i, 0) + 1;
            if(count > max) { 
                max = count;
                answer = i;
            } else if(count == max) { 
                answer = -1;
            }
            map.put(i, count);
        }
        
        return answer;
    }
}