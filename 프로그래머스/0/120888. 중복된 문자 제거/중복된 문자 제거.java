import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        Set<String> set = new LinkedHashSet<>();
        for(String s : my_string.split("")) {
            if (set.contains(s)) continue;
            set.add(s);
            answer += s;
        }
        
        return answer;
    }
}