import java.util.*;

public class Largeof3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int a = 10, b = 20, c = 25;
        // if ((a >= b) && (a >= c)) {
        // System.out.println("A is greater=" + a);
        // } else if ((b >= c)) {
        // System.out.println("B is greater=" + b);
        // } else {
        // System.out.println("C is greater=" + c);
        // }

        // Taking input from user
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a >= b) && (a >= c)) {
            System.out.println("A is greater=" + a);
        } else if ((b >= c)) {
            System.out.println("B is greater=" + b);
        } else {
            System.out.println("C is greater=" + c);
        }

    }
}
