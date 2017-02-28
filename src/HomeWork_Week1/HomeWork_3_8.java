package HomeWork_Week1;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 01.03.17.
 */
public class HomeWork_3_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        boolean result = checkNumbers(firstNumber, secondNumber);
        System.out.println("The last number (first) = the last number (second)?");
        System.out.println(result);
    }

    public static boolean checkNumbers(int firstNumber, int secondNumber) {
        firstNumber = firstNumber % 10;
        secondNumber = secondNumber % 10;
        if (firstNumber == secondNumber) {
            return true;
        } else {
            return false;
        }
    }
}