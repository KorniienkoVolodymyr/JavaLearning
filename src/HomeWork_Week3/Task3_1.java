package HomeWork_Week3;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 13.03.17.
 */
public class Task3_1 {
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

        int [][] matrixGenerate = Utilities.generateMatrix(lines, rows, min, max);
        for (int i = 0; i < matrixGenerate.length; i++) {
            for (int j = 0; j < matrixGenerate[i].length; j++) {
                if (matrixGenerate[i][j] % 5 == 0) {
                    matrixGenerate[i][j] = 777;
                }
                System.out.print(matrixGenerate[i][j] + " ");
            }
            System.out.println();
        }
    }
}
