
// Type casting or Narrowing or Explicit conversion
import java.util.*;

public class Typecasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = 94;
        float number2 = (float) number;
        System.out.println(number2);

        float marks = 99.999f;
        int no = (int) marks;
        System.out.println(no);

        char ch = 'a';
        int ascii = ch;
        System.out.println(ascii);
        /*
         * The above one is a special case in type casting and gives the ascii values of
         * the character if we convert char into int
         */
    }
}