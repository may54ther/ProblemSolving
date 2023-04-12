import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            int[] scores = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            float average = 0;
            int scoreCount = scores[0];
            for (int j = scoreCount; j >= 0; j--) {
                average = j > 0 ? average + scores[j] : average / scoreCount;
            }

            int validStudentCount = 0;
            for (int j = 1; j <= scoreCount; j++) {
                if (scores[j] > average) {
                    validStudentCount++;
                }
            }

            float percent = (float) validStudentCount / scoreCount * 100;
            System.out.printf("%.3f%%\n", percent);
        }

        br.close();
    }
}
