import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).sorted().toArray();
        int max = scores[n - 1];

        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (float) scores[i] / max * 100;
        }
        System.out.println(sum / n);
    }
}