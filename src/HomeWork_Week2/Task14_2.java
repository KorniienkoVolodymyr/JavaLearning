package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 08.03.17.
 */
public class Task14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array size: ");
        int arraySize = scanner.nextInt();
        System.out.println("Please enter array start point: ");
        int arrayStartPoint = scanner.nextInt();
        System.out.println("Please enter array end point: ");
        int arrayEndPoint = scanner.nextInt();

        int[] array = Utilities.generateArray(arraySize, arrayStartPoint, arrayEndPoint);
        int minValue = Utilities.minValueArray(array);
        int maxValue = Utilities.maxValueInArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                array[i] = maxValue;
                System.out.print(array[i] + " ");
                continue;
            }
            if (array[i] == maxValue) {
                array[i] = minValue;
                System.out.print(array[i] + " ");
                continue;
            }
            System.out.print(array[i] + " ");
        }
    }
}
