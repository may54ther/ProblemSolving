
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num = new Scanner(System.in).nextLine();
        System.out.println(Integer.parseInt(num.split(" ")[0]) - Integer.parseInt(num.split(" ")[1]));
    }
}