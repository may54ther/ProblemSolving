import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>(
            Arrays.asList(my_string.split(""))
        );
        
        return String.join("", set);
    }
}