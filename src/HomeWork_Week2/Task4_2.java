package HomeWork_Week2;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 06.03.17.
 */
public class Task4_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        int[] array = Utilities.converterToMas(number);

        int maxValue = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }
}
