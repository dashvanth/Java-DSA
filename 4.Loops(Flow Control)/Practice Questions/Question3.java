import java.util.*;

public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int factorial = 1;

        System.out.println("Enter you factorial number:");
        number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial is:" + factorial);
    }
}
