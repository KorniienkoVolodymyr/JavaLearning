package HomeWork_Week3;

/**
 * Created by volodymyrkorniienko on 13.03.17.
 */
public class Utilities {

    public static int[][] generateMatrix(int lines, int rows, int min, int max) {
        int result[][] = new int[lines][rows];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = (int) (Math.random() * (max + 1 - min) + min);
            }
        }
        return result;
    }

    public static int[] converterNumberToMas(int number) {
        int len = Integer.toString(number).length();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }
}
