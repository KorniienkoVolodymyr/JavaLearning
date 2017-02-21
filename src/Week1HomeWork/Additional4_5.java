package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 22.02.17.
 */
public class Additional4_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Second number: ");
        double secondNumber = sc.nextDouble();
        System.out.print("Third number: ");
        double thirdNumber = sc.nextDouble();

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.print("First = Second = Third");
        } else if (firstNumber == secondNumber && firstNumber != thirdNumber) {
            System.out.print("First = Second");
        } else if (firstNumber != secondNumber && firstNumber == thirdNumber) {
            System.out.print("First = Third");
        } else if (secondNumber == thirdNumber) {
            System.out.print("Second = Third");
        } else {
            System.out.print("First != Second != Third");
        }
    }
}
