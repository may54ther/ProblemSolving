import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] chessPiece = {1, 1, 2, 2, 2, 8};

        for (int count = 0; count < chessPiece.length; count++) {
            chessPiece[count] = chessPiece[count] - scan.nextInt();
        }

        for (int piece : chessPiece) {
            System.out.print(piece + " ");
        }
    }
}