package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 08.03.17.
 */
public class Task11_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter 2 words: ");
        String text = scanner.nextLine();

        String[] words = Utilities.textToWords(text);
        Utilities.changeWordsPosition(words);
    }
}
