import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] croatiaAlphabets = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();
        String word2 = word;

        for (String s : croatiaAlphabets) {
            while (word.contains(s)) {
                word = word.replace(s, "*");
            }
        }
        bw.write(word.length() + "\n");
        bw.flush();
    }
}