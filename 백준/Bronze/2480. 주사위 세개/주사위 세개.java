import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int answer = 0;

        if (a != b && a != c && b != c) {
            int max = Math.max(a, b);
            answer = Math.max(max, c) * 100;
        } else {
            if (a == b && b == c && a == c) {
                answer = 10000 + a * 1000;
            } else if (a == b || a == c) {
                answer = 1000 + a * 100;
            } else if (b == c) {
                answer = 1000 + c * 100;
            }
        }
        System.out.println(answer);
    }
}