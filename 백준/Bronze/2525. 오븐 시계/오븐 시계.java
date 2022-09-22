import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int cookingTime = scan.nextInt();

        int totalMinute = (hour * 60) + minute + cookingTime;
        
        hour = Math.floorDiv(totalMinute, 60) % 24;
        minute = totalMinute % 60;
        
        System.out.println(hour + " " + minute);
    }
}
