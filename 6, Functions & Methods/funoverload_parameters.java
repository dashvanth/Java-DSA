// function overloading: Function name is same but parameters are different
public class funoverload_parameters {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(30, 30, 30));
    }
}
