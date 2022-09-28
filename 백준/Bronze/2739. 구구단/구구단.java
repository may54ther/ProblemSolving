import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        for (int y = 1; y < 10; y++) {
            System.out.printf("%d * %d = %d\n", x, y, (x * y));
        }
    }
}