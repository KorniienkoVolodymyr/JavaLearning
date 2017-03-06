package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 06.03.17.
 */
public class Task7_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter size: ");
        int size = scanner.nextInt();
        System.out.println("Please start point: ");
        int start = scanner.nextInt();
        System.out.println("Please end point: ");
        int end = scanner.nextInt();

        int[] mas = Utilities.generateArray(size, start, end);
        int sumArray = Utilities.arraySum(mas);
        System.out.println(sumArray);
    }
}
