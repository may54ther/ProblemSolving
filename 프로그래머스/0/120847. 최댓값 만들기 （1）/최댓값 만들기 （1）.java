class Solution {
    public int solution(int[] numbers) {
        int max1 = 0;
        int max2 = 0;
        
        for (int n : numbers) {
            if (max1 < n) { 
                max2 = max1;
                max1 = n;
            } else if (max2 < n) {
                max2 = n;
            }
        }
        
        return max1 * max2;
    }
}

