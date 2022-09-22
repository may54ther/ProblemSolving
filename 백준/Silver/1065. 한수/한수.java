import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        int answer = 0;

        int[] num = new int[3];

        if (count <= 99) answer = count;
        else {
            answer = 99;
            for (int i = answer + 1; i <= count; i++) {
                num = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
                if ((num[2] - num[1]) == (num[1] - num[0])) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}