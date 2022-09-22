import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();

        if (0 <= hour && hour <= 23 && 0 <= minute && minute <= 59) {
            if (minute < 45) {
                if (hour == 0) hour = 24;
                hour = hour - 1;
                minute = 60 - (45 - minute);
            } else {
                minute = (minute - 45);
            }

            System.out.println(hour + " " + minute);
        }
    }
}