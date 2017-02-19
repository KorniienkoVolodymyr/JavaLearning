package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 19.02.17.
 */
public class Task4_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter first number: ");
        double b = sc.nextDouble();
        double result;

        if (a > b) {
            result = a - b;
            System.out.println("Differnce = " + result);
        }
        else {
            result = a + b;
            System.out.println("Sum: " + result);
        }
    }
}
