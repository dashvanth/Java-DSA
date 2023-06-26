import java.util.*;

public class CalculateSum {
    // public static void Sumof2() {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println("Sum is=" + sum);
    // sc.close();
    // }

    // public static void main(String args[]) {
    // Sumof2();
    // }

    // sum of two numbers by calling the parameters

    /*
     * this are called formal paramters which are used in definition
     */
    public static int Sumof2(int firstInput, int secondInpt) {
        int sum = firstInput + secondInpt;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Sumof2(a, b);
        /*
         * This are called as actual parameters or which used in function* call
         */
        System.out.println("sum is=" + sum);
        sc.close();
    }

}

// parameter/formal parameters VS actual parameters/ arguments