import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] rule = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        String[] phone = br.readLine().split("");
        int sum = 0;

        for (String p : phone) {
            for (int i = 0; i < rule.length; i++) {
                if (rule[i].contains(p)) {
                    sum += 3 + i;
                    break;
                }
            }
        }

        System.out.println(sum);
    }
}