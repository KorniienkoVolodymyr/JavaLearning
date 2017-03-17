package HomeWork_Week3;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 18.03.17.
 */
public class Task3_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter text: ");
        String[] text = scanner.nextLine().split(" ");
        String longWord = text[0];

        for (int i = 1; i < text.length; i++) {
            if (text[i].length() >= longWord.length()) {
                longWord = text[i];
            }
        }
        System.out.println(longWord);
    }
}
