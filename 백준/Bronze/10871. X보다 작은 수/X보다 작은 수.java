import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] opt = br.readLine().split(" ");
        int N = Integer.parseInt(opt[0]);
        int X = Integer.parseInt(opt[1]);

        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(nums[i]) < X) 
                bw.write(nums[i] + " ");
        }
        bw.flush();
    }
}