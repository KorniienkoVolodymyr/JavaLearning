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
        int array[] = Utilities.converterNumberToMas(number);
        int counter = 1;

        for (int i = 0; i < array.length; i++) {
            counter *= array[i];
        }
        System.out.println(counter);
    }
}
