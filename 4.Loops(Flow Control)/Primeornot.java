import java.util.*;

public class Primeornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is a prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) { // n is a multiply of i(n is not equal to 1 or n)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(n + " is a prime");
            } else {
                System.out.println(n + " is not a prime");
            }
        }
    }
}
