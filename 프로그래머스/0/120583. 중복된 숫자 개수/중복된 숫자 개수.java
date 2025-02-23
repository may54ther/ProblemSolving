import java.util.stream.IntStream;

class Solution {
    public int solution(int[] array, int n) {
        return (int)IntStream.of(array).filter(i -> i == n).count();
    }
}