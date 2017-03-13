package HomeWork_Week3;

/**
 * Created by volodymyrkorniienko on 13.03.17.
 */
public class Utilities {

    public static int[][] generateMatrix(int lines, int rows, int min, int max) {
        int result[][] = new int[lines][rows];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * (max + 1 - min) + min);
            }
        }
        return result;
    }
}
