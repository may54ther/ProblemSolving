import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int answer = Stream.of(scan.nextLine().split(""))
                .mapToInt(Integer::parseInt).sum();

        System.out.println(answer);
    }
}