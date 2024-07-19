class Solution {
    
    public String solution(String my_string, int s, int e) {
        
        String substr = my_string.substring(s, e+1);
        return my_string.replace(substr, reverse(substr));
    }
    
    public String reverse(String str) {
        
        return new StringBuilder(str).reverse().toString();
    }
}