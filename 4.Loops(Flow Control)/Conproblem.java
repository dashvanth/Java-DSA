import java.util.*;

public class Conproblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                System.out.println("The above no is mul of 10");
                continue;
            }
            System.out.println("The number you entered was:" + n);
        } while (true);

    }
}
