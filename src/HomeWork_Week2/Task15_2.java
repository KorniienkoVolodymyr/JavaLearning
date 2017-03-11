package HomeWork_Week2;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 08.03.17.
 */
public class Task15_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first array size: ");
        int firstArraySize = scanner.nextInt();
        System.out.println("Please enter first array start point: ");
        int firstArrayStartPoint = scanner.nextInt();
        System.out.println("Please enter first array end point: ");
        int firstArrayEndPoint = scanner.nextInt();
        System.out.println("Please enter second array size: ");
        int secondArraySize = scanner.nextInt();
        System.out.println("Please enter second array start point: ");
        int secondeArrayStartPoint = scanner.nextInt();
        System.out.println("Please enter first array end point: ");
        int secondArrayEndPoint = scanner.nextInt();

        int[] firstArray = Utilities.generateArray(firstArraySize, firstArrayStartPoint, firstArrayEndPoint);
        int[] secondArray = Utilities.generateArray(secondArraySize, secondeArrayStartPoint, secondArrayEndPoint);
        int[] combineArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            combineArray[i] = firstArray[i];
            System.out.print(combineArray[i] + " ");
        }
        for (int i = 0; i < secondArray.length; i++) {
            combineArray[firstArray.length + i] = secondArray[i];
            System.out.print(combineArray[i] + " ");
        }
    }
}