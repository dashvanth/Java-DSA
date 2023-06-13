package Questions;

import java.util.*;

public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // float pen = 10.6f;
        // float pencil = 5.8f;
        // float eraser = 15.3f;
        // float total = pen + pencil + eraser;
        // float gst = total+(total * 0.18f);
        // System.out.println(gst);

        // alternate soln (taking input from the user)

        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pen + pencil + eraser;
        float totalgst = total + (total * 0.18f);
        System.out.println(totalgst);
    }
}