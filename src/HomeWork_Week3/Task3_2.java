package HomeWork_Week3;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 13.03.17.
 */
public class Task3_2 {
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

        boolean checkMatrix = lines == rows;

        if (checkMatrix == true) {
            int[][] matrixGenerate = Utilities.generateMatrix(lines, rows, min, max);
            for (int i = 0; i < matrixGenerate.length; i++) {
                for (int j = 0; j < matrixGenerate[i].length; j++) {
                    System.out.print(matrixGenerate[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
        } else {
            System.out.println("Sorry lines and rows should be the same!!!");
        }
    }
}
