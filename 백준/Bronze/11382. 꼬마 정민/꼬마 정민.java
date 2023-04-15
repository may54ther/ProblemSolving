import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long sum = 0;

        for(String x : input) {
            sum += Long.parseLong(x);
        }

        System.out.println(sum);
    }
}
