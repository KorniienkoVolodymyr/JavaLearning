package HomeWork_Week3;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 17.03.17.
 */
public class Task3_9 {
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
                System.out.print(matrixGenerate[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        int column = matrixGenerate[0].length;
        int row = matrixGenerate.length;
        int [][] newMatrix = new int[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0, k = row - 1; j < row; j++, k--) {
                newMatrix[i][j] = matrixGenerate[k][i];
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
