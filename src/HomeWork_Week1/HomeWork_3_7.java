package HomeWork_Week1;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 01.03.17.
 */
public class HomeWork_3_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        boolean result = checkNumbers(firstNumber, secondNumber);
        System.out.println("First number divide to Second number without residue?");
        System.out.println(result);
    }

    public static boolean checkNumbers(int firstNumber, int secondNumber) {
        if (firstNumber % secondNumber == 0) {
            return true;
        } else {
            return false;
        }
    }
}
