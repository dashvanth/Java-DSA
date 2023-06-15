import java.util.*;

public class Que1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("It is a positive number");
        } else {
            System.out.println("It is a negative number");
        }
    }

}
