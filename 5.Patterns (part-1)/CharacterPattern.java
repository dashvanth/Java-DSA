
// Print Charcter Patten 
import java.util.*;

public class CharacterPattern {
    public static void main(String args[]) {
        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        // Another Method (By using ASCII values)

        // int n = 4;
        // char ch = (int) 97;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        // Taking Input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int number = sc.nextInt();
        char cha = 'A';
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cha);
                cha++;
            }
            System.out.println();
        }
    }
}
