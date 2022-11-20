import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] triangle = new int[N][N];
        int[][] sum = new int[N][N];
        int max = 0;

        for (int x = 0; x < N; x++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int y = 0; y < N; y++) {
                int y2 = y;

                if (st.hasMoreTokens()) {
                    triangle[x][y] = Integer.parseInt(st.nextToken());
                } else triangle[x][y] = -1;

                sum[x][y] = triangle[x][y];
                if (x > 0 && triangle[x][y] > -1) {
                    if (y > 0) y2 = y - 1;
                    sum[x][y] += Math.max(sum[x - 1][y2], sum[x - 1][y]);
                }
                
                if (x == N - 1)
                    max = Math.max(sum[x][y], max);
            }
        }
        
        System.out.println(max);
    }
}