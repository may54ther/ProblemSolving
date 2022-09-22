import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] counts = new int[size];
        String[] words = new String[size];

        for (int i = 0; i < size; i++) {
            counts[i] = scan.nextInt();
            words[i] = scan.nextLine().trim();
        }

        for (int i = 0; i < size; i++) {
            for (char word : words[i].toCharArray()) {
                for (int j = 0; j < counts[i]; j++) {
                    System.out.print(word);
                }
            }
            System.out.println();
        }
    }
}