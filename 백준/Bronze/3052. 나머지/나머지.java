import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int count = 10;

        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine()) % 42;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    count--;
                    break;
                }
            }
        }

        br.close();
        System.out.println(count);
    }
}