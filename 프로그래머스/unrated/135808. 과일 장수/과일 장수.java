import java.util.*;

class Solution {
   public int solution(int k, int m, int[] score) {
        int answer = 0;
        int size = score.length;
        int start = size % m == 0 ? 0 : size % m;
        int numberOfBox = Math.floorDiv(size, m);

        Arrays.sort(score);
        for (int i = 0; i < numberOfBox; i++) {
            int index = start + i * m;
            answer += m * score[index];
        }

        return answer;
    }
}