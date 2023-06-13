public class Typepromotion {
    public static void main(String args[]) {
        // first rule in type promotion expression is it will convert all the types of
        // expression into int type
        // byte a = 1;
        // char c = 'a';
        // System.out.println(c - a);

        // char a = 'a';
        // char b = 'b';
        // int c = a - b;
        // System.out.println(c);

        // short a = 5;
        // byte b = 2;
        // char c = 'a';
        // byte bt = (byte) (a + b + c);// this expression converts everthing into int
        // type
        // System.out.println(bt);

        // Second rule , The larger between short long double is will be converted as
        // their datatypes. ex:if double has larger value then remaining types are
        // converted into double

        // short a = 50;
        // long b = 70;
        // double c = 75.5;
        // System.out.println(a + b + c);// the values will be converted into double

        // byte b = 5;
        // b = (b * 2);
        // System.out.println(b);// This is wrong becasue the expression converts it to
        // int and we are trying to
        // convert into to byte

        byte b = 5;
        b = (byte) (b * 2);
        System.out.println(b);// this is right bcoz we are typecasting it to byte

    }
}