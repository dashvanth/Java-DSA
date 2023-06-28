public class Primeno {
    public static boolean prime(int n) {
        boolean primeno = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                primeno = false;
                System.out.println(+n + " is not a prime number");
            } else {
                System.out.println(+n + " is a PRIME number");
            }
        }
        return primeno;
    }

    public static void main(String[] args) {
        System.out.println(prime(4));
        System.out.println(prime(3));
    }
}
