import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr;
        int sum;

        while (true) {
            arr = br.readLine().split(" ");
            sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);

            if (sum != 0)
                bw.write(sum + "\n");
            else break;
        }
        bw.flush();
    }
}