class Solution {
    
    public String solution(String s) {
        
        String[] tokens = s.split("", -1);
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (String token : tokens) {
            if(token.isBlank()) {
                index=0;
            } else {
                if(index % 2 == 0) {
                    token = token.toUpperCase();
                } else {
                    token = token.toLowerCase();
                }
                index++;
            }
            sb.append(token);
        }

        return sb.toString();
    }
}