import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int[] A = new int[N];
        String answer = "";
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();

            if (A[i] < X) answer += A[i] + " ";
        }
        System.out.println(answer);
    }
}