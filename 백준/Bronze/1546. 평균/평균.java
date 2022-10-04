import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;
        float result = 0;

        for (int i = 0; i < n; i++) {
            result += scores[i];
            max = Math.max(max, scores[i]);
        }
        
        result = (result / max * 100) / n;
        System.out.println(result);
    }
}