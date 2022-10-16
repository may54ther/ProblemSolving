import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    static String fibonacci_dp(int n) {
        int size = n + 1;
        int[] f = new int[size];
        int i = 3;

        f[1] = f[2] = 1;
        for (i = 3; i < size; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        
        return f[n] + " " + (i - 3);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci_dp(n));
    }
}