class Solution {
        
    public int[] solution(int n, int m) {
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        while(min > 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
       
        int gcd = max;
        int lcm = Math.floorDiv((n * m), max);
        
        return new int[]{gcd, lcm};
    }
}