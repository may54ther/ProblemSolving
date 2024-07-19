
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while (!(input = br.readLine()).equals("0")) {

            if (input.charAt(0) == '0') {
                System.out.println("no");
                continue;
            }

            int length = input.length();
            int middle = Math.floorDiv(length, 2);

            String str1 = input.substring(0, middle);
            String str2 = new StringBuilder(input.substring(length - middle)).reverse().toString();

            if (str1.equals(str2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
