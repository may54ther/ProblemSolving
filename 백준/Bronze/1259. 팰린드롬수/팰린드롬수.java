import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (true) {
            line = br.readLine();
            if ("0".equals(line)) {
                break;
            }

            int size = line.length();
            char[] chars = line.toCharArray();
            boolean check = true;

            if (chars[0] == '0')
                check = false;
            else {
                for (int i = 0; i < Math.floorDiv(size, 2); i++) {
                    if (chars[i] != chars[size - 1 - i]) {
                        check = false;
                        break;
                    }
                }
            }

            System.out.println(!check ? "no" : "yes");
        }
    }
}
