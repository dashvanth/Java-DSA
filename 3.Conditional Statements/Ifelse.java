import java.util.*;

public class Ifelse {
    public static void main(String args[]) {
        // int age = 15;
        // if (age >= 18) {
        // System.out.println("Adult- Eligible to : vote, drive, college");
        // }
        // if (age > 13 && age < 18) {
        // System.out.println("Teenager");
        // } else {
        // System.out.println("Not eligible to : vote, drive, college");
        // }

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult: Eligible to : vote, drive, college");
        } else if (age > 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not Adult: Not Eligible to : vote, drive, college");
        }
    }
}