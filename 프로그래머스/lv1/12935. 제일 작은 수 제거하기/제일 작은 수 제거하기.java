import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
         int min = Arrays.stream(arr).min().getAsInt();

        return arr.length < 2 
                ? new int[]{-1} 
                : Arrays.stream(arr).filter(n -> n != min).toArray();
    }
}