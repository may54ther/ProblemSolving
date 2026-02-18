import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s2));
    
        int answer = 0; 
        for(String str : s1) {
            if (set.contains(str)) answer++;
        }
    
        return answer;
    }
}