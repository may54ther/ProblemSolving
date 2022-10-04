import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isGroupWord()) count++;
        }
        System.out.println(count);
    }

    public static boolean isGroupWord() throws IOException {
        String word = br.readLine();
        boolean[] check = new boolean[26];
        int prev = 0;

        for (int i = 0; i < word.length(); i++) {
            int current = word.charAt(i);
            if (prev != current) {
                if (!check[current - 'a']) {
                    check[current - 'a'] = true;
                    prev = current;
                } else return false;
            }
        }
        return true;
    }
}