package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 08.03.17.
 */
public class Task13_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array size: ");
        int arraySize = scanner.nextInt();
        System.out.println("Please enter array start point: ");
        int arrayStartPoint = scanner.nextInt();
        System.out.println("Please enter array end point: ");
        int arrayEndPoint = scanner.nextInt();

        int[] array = Utilities.generateArray(arraySize, arrayStartPoint, arrayEndPoint);
        double avgArray = (Utilities.arraySum(array)) / array.length;
        System.out.println("Average  = " + avgArray);
    }
}
