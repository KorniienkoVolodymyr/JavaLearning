package HomeWork_Week3;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 14.03.17.
 */
public class Task3_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        String info = scanner.nextLine();

        int length = info.length();
        char[] array = info.toCharArray();
        char[] arrayReverse = new char[length];

        for (int i = 0; i < array.length; i++) {
            arrayReverse[arrayReverse.length - 1 - i] = array[i];
        }


        String initialArray = String.valueOf(array);
        String reverseArray = String.copyValueOf(arrayReverse);

        if (initialArray.equals(reverseArray)) {
            System.out.println("Enter text polindrom!!!");
        } else {
            System.out.println("Enter text not a polindrom!");
        }
    }
}