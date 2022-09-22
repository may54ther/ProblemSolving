import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char alphabet = 97;
        int index;

        for (int i = 0; i < 26; i++) {
            index = s.indexOf(String.valueOf(alphabet++));
            if (index < 0) 
                index = -1;
            
            System.out.println(index);
        }
    }
}