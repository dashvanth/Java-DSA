import java.util.*;

public class printnumbers {
    public static void main(String args[]) {
        // int number = 1;
        // while (number <= 10) {
        // System.out.println(number);
        // number++;
        // }

        // taking input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number:");
        int range = sc.nextInt();
        int number = 1;
        while (number <= range) {
            System.out.print(number + " ");
            number++;
        }
    }
}
