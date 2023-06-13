package Questions;
// public class Q1 {

// public static void main(String args[]) {
// int a = 10, b = 20, c = 30;
// int sum = a + b + c;
// int n = sum / 3;
// System.out.println(n);
// }
// } alternate solution below(taking input from the user)

import java.util.*;

public class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int firstvalue = sc.nextInt();
        int secondvalue = sc.nextInt();
        int thirdvalue = sc.nextInt();
        int sum = firstvalue + secondvalue + thirdvalue;
        int avg = sum / 3;
        System.out.println("The sum of the 3 values is " + sum);
        System.out.println("The Average of the 3 values is " + avg);
    }
}