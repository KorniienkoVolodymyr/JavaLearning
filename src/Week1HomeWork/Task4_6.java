package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 19.02.17.
 */
public class Task4_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter first number: ");
        double b = sc.nextDouble();
        double sum = a + b;

        if (sum >= 11 && sum <= 19)
        {
            System.out.print("Sum = " + sum);
        }
        else {
            System.out.print("Sorry...");
        }
    }
}

