import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();

        for (int i = 0; i < loop; i++) {
            int count = scan.nextInt();
            String[] word = scan.nextLine().trim().split("");

            for (String w : word) {
                for (int j = 0; j < count; j++) {
                    System.out.print(w);
                }
            }
            System.out.println();
        }
    }
}