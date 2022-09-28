import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] opt = br.readLine().split(" ");
        int N = Integer.parseInt(opt[0]);
        int X = Integer.parseInt(opt[1]);

        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(nums[i]) < X) System.out.print(nums[i] + " ");
        }
    }
}