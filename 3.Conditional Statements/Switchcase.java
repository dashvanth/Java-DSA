import java.util.*;

public class Switchcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int waiter = sc.nextInt();
        switch (waiter) {
            case 1:
                System.out.println("Give me a burger");
                break;
            case 2:
                System.out.println("Give me a Samosa");
                break;
            case 3:
                System.out.println("Give me a Pizza");
                break;
            case 4:
                System.out.println("Give me a Hot-coffee");
                break;

            default:
                System.out.println("Nothing! Give me a glass of water :)");

        }
    }
}
