class Solution {
    public int[] solution(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            int n = arr[i];
            
            if (n >= 50 && n % 2 == 0) arr[i] = n / 2;
            else if (n < 50 && n % 2 != 0)  arr[i] = n * 2;
        }
        
        return arr;
    }
}