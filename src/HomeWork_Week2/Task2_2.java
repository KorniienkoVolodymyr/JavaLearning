package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 05.03.17.
 */
public class Task2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        int array[] = Utilities.converterToMas(number);

        for (int i = 0; i < array.length - 1; i++) {
            array[i + 1] *= array[i];
        }
        System.out.println(array);
    }
}