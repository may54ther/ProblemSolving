class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        int count = cipher.length() / code;
        for(int i = 1; i <= count; i++) {
            answer += cipher.charAt(code * i - 1);
        }
        return answer;
    }
}