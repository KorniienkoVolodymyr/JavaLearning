package HomeWork_Week3;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 14.03.17.
 */
public class Task3_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter count of lines: ");
        int lines = scanner.nextInt();
        System.out.println("Please enter count of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Please enter min value: ");
        int min = scanner.nextInt();
        System.out.println("Please enter max value: ");
        int max = scanner.nextInt();

        int array[] = new int[rows];


        int [][] matrixGenerate = Utilities.generateMatrix(lines, rows, min, max);

        for (int i = 0; i < matrixGenerate.length; i++) {
            for (int j = i; j < matrixGenerate[i].length;) {
                int number = matrixGenerate[i][j];
                array[i] = number;
                System.out.print(array[i]);
                break;
            }
        }
    }
}
