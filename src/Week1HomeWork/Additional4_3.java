package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 22.02.17.
 */
public class Additional4_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three-digit number: ");
        int number = sc.nextInt();

        int firstNumber = (number / 100) % 10;
        int secondNumber = (number / 10) % 10;
        int thirdNumber = number % 10;

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
