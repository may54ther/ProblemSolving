import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int min, max;

        min = max = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        
        
        return min + " " + max;
    }
}