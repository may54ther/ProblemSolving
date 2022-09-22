import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String answer = "";

        switch (score / 10) {
            case 10:
                answer = "A";
                break;
            case 9:
                answer = "A";
                break;
            case 8:
                answer = "B";
                break;
            case 7:
                answer = "C";
                break;
            case 6:
                answer = "D";
                break;
            default:
                answer = "F";
                break;
        }

        System.out.println(answer);
    }
}