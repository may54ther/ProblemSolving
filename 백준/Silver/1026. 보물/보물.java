import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
       
        int sum = 0;
        Arrays.sort(A, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                return Integer.compare(Integer.parseInt(x), Integer.parseInt(y));
            }
        });
        Arrays.sort(B, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                return Integer.compare(Integer.parseInt(y), Integer.parseInt(x));
            }
        });

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(A[i]) * Integer.parseInt(B[i]);
        }

        System.out.println(sum);
    }
}
