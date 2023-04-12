import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
     public static void main(String[] args) throws IOException {
        //Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        //Implementation
        for (int i = 1; i < n; i++) {
            int k = numbers[i];
            for (int j = i; j > 0; j--) {
                if (numbers[j - 1] > k) {
                    numbers[j] = numbers[j - 1];
                    if (j == 1) {
                        numbers[j - 1] = k;
                        break;
                    }
                } else {
                    numbers[j] = k;
                    break;
                }
            }
        }

        //Print
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}