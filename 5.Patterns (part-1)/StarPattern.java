
//Program to print Star Pattern
import java.util.*;

public class StarPattern {
    public static void main(String args[]) {
        // // The below loop is for how much lines you want to prevent
        // for (int line = 1; line <= 5; line++) {
        // // The below loop is for stars to print that are equal to the inputs line
        // for (int star = 1; star <= line; star++) {
        // // we should not use println(because it prints the stars to the next line)
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines of stars you want to print:");
        int line = sc.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}