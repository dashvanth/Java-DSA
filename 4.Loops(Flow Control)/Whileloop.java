import java.util.*;

public class Whileloop {
    public static void main(String args[]) {
        // int counter = 0;
        // while (counter < 10) {
        // System.out.println("Hey there! How'you doinnn :)");
        // counter++;
        // }

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial value of number of times you want to print your value:)");
        int times = sc.nextInt();
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        System.out.println("Enter the THING you want to print (NOTE! This takes only the first word)");
        String statement = sc.next();
        System.out.println("Here's the thing printed below!");

        while (times < limit) {
            System.out.println(statement);
            times++;
        }
        System.out.println("Hmm Printed the 'THING' that you have given =" + times);
    }
}