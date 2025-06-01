import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.concat(
                IntStream.range(n, num_list.length).map(i -> num_list[i]),
                IntStream.range(0, n).map(i -> num_list[i])
        ).toArray();
    }
}
