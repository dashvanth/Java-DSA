import java.util.*;

public class Que3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        switch (days) {
            case 1:
                System.out.println("It's a Monday:)");
            case 2:
                System.out.println("It's a Tuesday:)");
                break;
            case 3:
                System.out.println("It's a Wednesday:)");
                break;
            case 4:
                System.out.println("It's a Thursday:)");
                break;
            case 5:
                System.out.println("It's a Friday:)");
                break;
            case 6:
                System.out.println("It's a Saturday:)");
                break;
            case 7:
                System.out.println("It's a Sunday:)");
                break;
            default:
                System.out.println("Invalid Input! Please enter from 1-7");

        }
    }
}
