package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 06.03.17.
 */
public class Utilities {

    public static int[] converterNumberToMas(int number) {
        int len = Integer.toString(number).length();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }

    public static int maxValueInArray(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int minValueArray(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int[] generateArray(int size, int startPoint, int endPoint) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (endPoint - startPoint) + startPoint);
        }
        return arr;
    }

    public static int arraySum(int[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] += sumArray;
            sumArray = array[i];
        }
        return sumArray;
    }
}