class Solution {
    public String solution(int age) {
        StringBuilder builder = new StringBuilder();
        String strAge = String.valueOf(age);
        
        for (int i = 0; i < strAge.length(); i++) {
            builder.append((char) (strAge.charAt(i) - '0' + 'a'));
        }
        return builder.toString();
    }
}

