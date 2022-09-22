import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int A = Integer.parseInt(str.split(" ")[0]);
        int B = Integer.parseInt(str.split(" ")[1]);
        int C = Integer.parseInt(str.split(" ")[2]);


        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}