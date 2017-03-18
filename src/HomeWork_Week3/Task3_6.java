package HomeWork_Week3;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 18.03.17.
 */
public class Task3_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        String numbers = scanner.nextLine() ;

        String[] numbersZero = numbers.split("1");
        String[] numberFirst = numbers.split("0");

        String zeroMaxLength = numbersZero[0];
        String firstMaxLength = numbersZero[0];

        for (int i = 1; i < numbersZero.length; i++) {
            String zero = numbersZero[i];
            if (zeroMaxLength.length() <= zero.length()) {
                zeroMaxLength = zero;
            }
        }

        for (int i = 1; i < numberFirst.length; i++) {
            String first = numberFirst[i];
            if (firstMaxLength.length() <= first.length()) {
                firstMaxLength = first;
            }
        }

        System.out.println("Zero max length = " + numbers.indexOf(zeroMaxLength) + "," + (numbers.indexOf(zeroMaxLength) + zeroMaxLength.length() - 1));
        System.out.println("First max length = " + numbers.indexOf(firstMaxLength) + "," + (numbers.indexOf(firstMaxLength) + firstMaxLength.length() - 1));

//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 0) {
//                continue;
//            }
//        }
    }
}
