package HomeWork_Week1;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 28.02.17.
 */
public class HomeWork_3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        copareNumbers(firstNumber, secondNumber);
    }

    public static void copareNumbers(int x, int y) {
        if (x > y) {
            x = x - y;
            System.out.println("Firs number = " + x + " " + "Second number = " + y);
        } else if (x < y) {
            y = x + y;
            System.out.println("Firs number = " + x + " " + "Second number = " + y);
        } else {
            System.out.println("Verify numbers");
        }
    }
}