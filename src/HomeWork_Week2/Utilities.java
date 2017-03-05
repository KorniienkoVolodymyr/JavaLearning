package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 06.03.17.
 */
public class Utilities {

    public static int[] converterToMas (int number) {
        int len = Integer.toString(number).length();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }
}
