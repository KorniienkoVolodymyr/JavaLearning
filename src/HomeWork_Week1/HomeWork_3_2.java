package HomeWork_Week1;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 27.02.17.
 */
public class HomeWork_3_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = sc.nextInt();

        int resultMin = methodMin(firstNumber, secondNumber, thirdNumber);
        int resultMax = methodMax(firstNumber, secondNumber, thirdNumber);
        System.out.println("Min = " + resultMin + " " + "Max = " + resultMax);
    }

    public static int methodMin(int a, int b, int c) {
        if (a == Math.min(a, b) && a == Math.min(a, c)) {
            return a;
        }
        if (b == Math.min(a, b) && b == Math.min(b, c)) {
            return b;
        }
        if (c == Math.min(a, b) && c == Math.min(b, c)) {
            return c;
        }
        System.out.println("Error");
        return 0;
    }

    public static int methodMax(int a, int b, int c) {
        if (a == Math.max(a, b) && a == Math.max(a, c)) {
            return a;
        }
        if (b == Math.max(a, b) && b == Math.max(b, c)) {
            return b;
        }
        if (c == Math.max(a, b) && c == Math.max(b, c)) {
            return c;
        }
        System.out.println("Error");
        return 0;
    }
}