class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int index = s.substring(0, i)
                            .lastIndexOf(ch);
            
            answer[i] = index == -1 ? -1 : i - index;
        }
        
        return answer;
    }
}