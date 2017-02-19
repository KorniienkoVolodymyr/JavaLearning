package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 19.02.17.
 */
public class Task4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number b: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number c: ");
        double c = sc.nextDouble();

        //Equal
        if (a == b && b == c) {
            System.out.println("Numbers equal!");
        } else {

            //Find Max
            if (a > b && a > c) {
                System.out.println("Max a:" + a);
            } else if (b > a && b > c) {
                System.out.println("Max b:" + b);
            } else {
                System.out.println("Max c: " + c + " ");
            }

            //Find Min
            if (a <= b && a <= c) {
                System.out.println("Min a:" + a);
            } else if (b <= a && b <= c) {
                System.out.println("Min b:" + b);
            } else {
                System.out.println("Min c:" + c);
            }
        }
    }
}