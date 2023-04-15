import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[2][n];
        arr[0] = br.readLine().split(" ");
        arr[1] = br.readLine().split(" ");

        int sum = 0;
        int[] A = Arrays.stream(arr[0])
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .toArray();
        int[] B = Arrays.stream(arr[1])
                        .mapToInt(Integer::parseInt)
                        .sorted()
                        .toArray();

        for (int i = 0; i < n; i++) {
            sum += A[i] * B[(n - 1) - i];
        }

        System.out.println(sum);
    }
}
