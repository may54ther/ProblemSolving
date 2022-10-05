import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());
                                   
        return Long.parseLong(String.join("", arr));
    }
}