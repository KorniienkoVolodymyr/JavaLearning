package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 19.02.17.
 */
public class Task4_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first nubmer: ");
        double a = sc.nextDouble();
        System.out.print("Enter second nubmer: ");
        double b = sc.nextDouble();

        int resultTrue = (int) (a / b);
        double resultFalse = a % b;

        boolean result = resultFalse == 0;

        if (result) {
            System.out.print(result + " ");
            System.out.print("The integer part of " + resultTrue + " ");
            System.out.print("remainder of the division " + resultFalse);
        }
        else {
            System.out.print(result + " ");
            System.out.print("Remainder of the division " + resultFalse + " ");
            System.out.print("the integer part of " + resultTrue);
        }
    }
}
