public class HelloWorldFun {
    public static void /* this is function name */ printHelloWorld(/* this is function parameter */) {
        System.out.println("Hello world using functions!");
        return; // return type must be there for all functions except for void returntpye
    }

    public static void main(String[] args) {
        printHelloWorld(); // This is function call
    }
}

/*
 * Understand Functions vs methods
 * 
 * the functions which are return inside the class are called as methods..!
 * Example: The above program is example of methods which java functions are
 * return inside the class.
 * 
 * where in c++ we can declare functions outside of the class also that are
 * called as functions
 */