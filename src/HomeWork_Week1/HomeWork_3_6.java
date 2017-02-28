package HomeWork_Week1;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 01.03.17.
 */
public class HomeWork_3_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        checkNumbers(firstNumber, secondNumber);
    }

    public static void checkNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        if (sum >= 11 && sum <= 19) {
            System.out.println("First + Second numbers = " + sum);
        } else {
            System.out.println("Sorry!");
        }
    }
}
