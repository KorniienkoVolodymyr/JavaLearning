package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 06.03.17.
 */
public class Task6_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size: ");
        int size = scanner.nextInt();
        System.out.println("Please start point: ");
        int start = scanner.nextInt();
        System.out.println("Please end point: ");
        int end = scanner.nextInt();

        int[] mas = Utilities.generateArray(size, start, end);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.abs(mas[i]);
        }
        int minValue = Utilities.minValueArray(mas);
        System.out.println("Min number modulo = " + minValue);
    }
}
