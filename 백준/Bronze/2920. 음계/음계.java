import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] scales = br.readLine().split(" ");
        String result = "";

        for (int i = 0; i < scales.length - 1; i++) {
            int sign = Integer.parseInt(scales[i]) - Integer.parseInt(scales[i + 1]);

            if (sign == -1)
                result = "ascending";
            else if (sign == 1)
                result = "descending";
            else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }
}