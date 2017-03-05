package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 05.03.17.
 */
public class Task3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        int len = Integer.toString(number).length();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = number % 10;
            number /= 10;
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
