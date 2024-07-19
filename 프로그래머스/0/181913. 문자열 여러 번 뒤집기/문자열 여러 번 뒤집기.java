class Solution {
    
    public String solution(String my_string, int[][] queries) {
        
        String answer = my_string;
        
        for(int[] query : queries) {
            
            int s = query[0];
            int e = query[1] + 1;
            
            String prefix = answer.substring(0, s);
            String word = answer.substring(s, e);
            String subfix = answer.substring(e);
            
            answer = prefix + reverse(word) + subfix;
        }

        return answer;
    }
    
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}