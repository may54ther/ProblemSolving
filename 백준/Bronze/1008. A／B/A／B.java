import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num = new Scanner(System.in).nextLine();
        int a = Integer.parseInt(num.split(" ")[0]);
        int b = Integer.parseInt(num.split(" ")[1]);

        System.out.println((double) a / b);
    }
}