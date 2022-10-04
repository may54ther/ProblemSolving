import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[9];
        int maxIndex = 0, maxValue = 0;

        for (int i = 0; i < 9; i++) {
            number[i] = Integer.parseInt(br.readLine());
            if (maxValue < number[i]) {
                maxValue = number[i];
                maxIndex = i + 1;
            }
        }
        System.out.printf("%d\n%d", maxValue, maxIndex);
    }
}