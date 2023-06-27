import java.util.Scanner;

public class Productof2 {
    public static int Multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        // int prod = Multiply(3, 5);
        // System.out.println(prod);

        // by taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int prod = Multiply(a, b);
        System.out.println(+a + " * " + b + " = " + prod);
        sc.close();
    }
}
