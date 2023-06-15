import java.util.*;

public class Question5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Yes! It's a leap year");
        } else {
            System.out.println("No! Not a leap year");
        }
    }
}
