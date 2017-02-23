package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 23.02.17.
 */
public class Additional4_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        if (a + b + c > 0) {
            a *= a;
            b *= b;
            c *= c;
            System.out.print("a = " + a + " b = " + b + " c = " + c);
        }
        else {
            a = 0;
            b = 0;
            c = 0;
            System.out.print("a = " + a + " b = " + b + " c = " + c);
        }
    }
}
