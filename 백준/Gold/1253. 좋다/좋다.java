import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        br.close();

        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(tokens[i]);
        }
        Arrays.sort(A);

        int count = 0;
        for (int i = 0; i < N; i++) {
            long find = A[i], sum = 0;
            int left = 0, right = N - 1;

            while (left < right) {
                sum = A[left] + A[right];
                
                if (sum == find) {
                    if (left != i && right != i) {
                        count++;
                        break;
                    } else if (left == i)
                        left++;
                    else if (right == i)
                        right--;
                } else if (sum < find)
                    left++;
                else
                    right--;
            }
        }

        System.out.println(count);
    }
}