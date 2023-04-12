import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = new String[2];
        int sum;

        while (true) {
            try {
                arr = br.readLine().split(" ");
                sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
                bw.write(String.valueOf(sum));
                bw.newLine();
                bw.flush();
            } catch (Exception e) {
                break;
            }
        }
    }
}