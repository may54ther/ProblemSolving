import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(reader.readLine());

        for (int i = 0; i < loop; i++) {
            int count = reader.read() - 48;
            String[] word = reader.readLine().trim().split("");

            for (String w : word) {
                for (int j = 0; j < count; j++) {
                    System.out.print(w);
                }
            }
            System.out.println();
        }
    }
}