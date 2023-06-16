import java.util.*;

public class Reverseofno {
    public static void main(String args[]) {
        // int n = 90701;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n = n / 10;
        // }

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        int yourvalue = sc.nextInt();
        while (yourvalue > 0) {
            int lastdigit = yourvalue % 10;
            System.out.print(lastdigit);
            yourvalue = yourvalue / 10;
        }
    }
}
