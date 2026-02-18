class Solution {
    public String solution(String my_string) {
        StringBuilder builder = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            if ("aeiou".indexOf(c) == -1) {
                builder.append(String.valueOf(c));
            }
        }
        
        return builder.toString();
    }
}