import java.util.Arrays;

public class Main {

    public static int d(int n) {
        int sum = n;
        int length = String.valueOf(n).length();

        for (int count = 0; count < length; count++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        boolean[] isSelfNumber = new boolean[10035];
        Arrays.fill(isSelfNumber, false);

        for (int i = 1; i < isSelfNumber.length; i++) {
            if (d(i) >= isSelfNumber.length) break;

            isSelfNumber[d(i)] = true;
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }
}