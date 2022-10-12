import java.util.*;
import java.util.Map.Entry;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String p : participant) {
             if (map.containsKey(p)) {
                Integer value = map.get(p);
                map.put(p, ++value);
            } else {
              map.put(p, 1);
             }
        }
        
        for (String c : completion) {
            if (map.containsKey(c)) { 
                Integer value = map.get(c);
                map.put(c, --value);
            } 
        }
        
        for (Entry<String, Integer> entrySet : map.entrySet()) {
            if(entrySet.getValue() == 1) {
                answer = entrySet.getKey();
            }
        }

        return answer;
    }
}