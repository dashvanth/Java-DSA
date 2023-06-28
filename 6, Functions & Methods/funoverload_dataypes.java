public class funoverload_dataypes {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(6, 6));

        System.out.println(sum(5.4f, 6.6f));
    }
}
