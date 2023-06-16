import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int sumofeven = 0;
        int sumofodd = 0;

        do {
            System.out.println("Enter the number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                sumofeven += number;
            } else {
                sumofodd += number;
            }
            System.out.println("If you want to continue Press 1 or 0 to exit!!");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of even numbers: " + sumofeven);
        System.out.print("Sum of odd numbers: " + sumofodd);

    }
}