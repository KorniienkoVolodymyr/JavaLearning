package HomeWork_Week1;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 27.02.17.
 */
public class HomeWork_3_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        checkNumber(number);
    }

    public static void checkNumber(int x) {
        if (x % 7 == 0) {
            x *= x;
            System.out.println("Number = " + x);
        } else {
            System.out.print("Sorry");
        }
    }
}
