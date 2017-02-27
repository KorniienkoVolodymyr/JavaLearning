package HomeWork_Week1;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 28.02.17.
 */
public class HomeWork_3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        float number = sc.nextFloat();
        checkNumber(number);
    }

    public static void checkNumber(float x) {
        if (x >= 0 && x <= 1) {
            System.out.println("Good number");
        } else {
            System.out.println("Bad number");
        }
    }
}
