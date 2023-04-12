import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum, score;

        for (int i = 0; i < n; i++) {
            String testcase = br.readLine();

            sum = score = 0;
            for (char tc : testcase.toCharArray()) {
                score = (tc == 'O') ? score + 1 : 0;
                sum += score;
            }
            System.out.println(sum);
        }
        br.close();
    }
}