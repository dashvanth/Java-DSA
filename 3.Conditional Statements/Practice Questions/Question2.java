import java.util.*;

public class Que2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature value");
        double temp = sc.nextDouble();
        if (temp > 100) {
            System.out.println("You have a fever,please consult a doctor:)");
        } else {
            System.out.println("You do not have a fever:)");
        }
    }
}
