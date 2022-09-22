import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int timer = scan.nextInt();

        int sum = minute + timer;
        int divHour = Math.floorDiv(sum, 60);
        int divMinute = sum % 60;

        hour = (hour + divHour) % 24;
        minute = divMinute;

        System.out.println(hour + " " + minute);
    }
}