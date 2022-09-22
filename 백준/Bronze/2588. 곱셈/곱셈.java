import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int result = x * y;

        for (int count = 0; count < 3; count++) {
            System.out.println(x * (y % 10));
            y = y / 10;
        }
        System.out.println(result);
    }
}