public class Arithematicopr {
    public static void main(String args[]) {
        int A = 10, B = 5;
        // Binary Operators
        System.out.println("ADD = " + (A + B));
        System.out.println("SUB = " + (A - B));
        System.out.println("MUL = " + (A * B));
        System.out.println("DIV = " + (A / B));
        System.out.println("MODULO(REMINDER) = " + (A % B));

        // Unary Operators
        // pre-increment
        int c = 10;
        int d = ++c;// it adds the value and then assigns.
        System.out.println(c);
        System.out.println(d);
        // post-increment
        int e = 10;
        int f = e++;// it assigns first and then adds the value
        System.out.println(e);
        System.out.println(f);
        // pre-decrement
        int g = 10;
        int h = --g;// it subtracts the value and then assigns.
        System.out.println(g);
        System.out.println(h);
        // post decrement
        int i = 10;
        int j = i--;// it assigns first and then subtracts the value
        System.out.println(i);
        System.out.println(j);
    }
}