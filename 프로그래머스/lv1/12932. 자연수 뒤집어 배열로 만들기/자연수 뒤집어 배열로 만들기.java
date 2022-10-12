import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        int size = Long.toString(n).length();
        int[] answer = new int[size];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        
        return answer;
    }
}
