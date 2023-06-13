
//input in java
import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // sc.close();
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);

        long largenumber = sc.nextLong();
        System.out.println(largenumber);

        // short small = sc.nextShort();
        // System.out.println(small);

        double pricedouble = sc.nextDouble();
        System.out.println(pricedouble);

        boolean truefalse = sc.nextBoolean();
        System.out.println(truefalse);

    }
}
