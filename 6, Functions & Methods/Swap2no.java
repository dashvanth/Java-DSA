public class Swap2no {
    public static void Swap(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("in swap function a =" + num1);
        System.out.println("in swap function b =" + num2 + "\n");
        // return;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Swap(a, b);
        System.out.println("in main function a =" + a);
        System.out.println("in main function b =" + b);
        /*
         * the value doesn't change in the above statement coz of call by value, the
         * fucntion recieves the copy of the variable not the real value, if any changes
         * done in functions it remains in the function only [java always works call
         * by value]
         * 
         * Call by value vs Call by reference
         * call by value= giving only copy of the value(not original)
         * call by reference= giving orginal value to the function
         */

    }
}
