import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] AB;
        int A, B;

        for (int i = 0; i < T; i++) {
            AB = br.readLine().split(" ");
            A = Integer.parseInt(AB[0]);
            B = Integer.parseInt(AB[1]);

            System.out.printf("Case #%d: %d + %d = %d\n", i+1, A, B, (A + B));
        }
    }
}