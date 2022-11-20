import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N, count = 0;
        String numbers, v;

        N = Integer.parseInt(br.readLine());
        numbers = br.readLine();
        v = br.readLine();
        br.close();

        StringTokenizer st = new StringTokenizer(numbers, " ");
        for (int i = 0; i < N; i++) {
            if (st.nextToken().equals(v)) count++;
        }

        System.out.println(count);
    }
}