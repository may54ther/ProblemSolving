import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 2;
        boolean[] isSubmit = new boolean[30];
        
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            isSubmit[n - 1] = true;
        }
		br.close();
		
        for (int i = 0; i < 30; i++) {
            if (!isSubmit[i] && count-- > 0) {
                System.out.println(i+1);
            }
        }
    }
}
