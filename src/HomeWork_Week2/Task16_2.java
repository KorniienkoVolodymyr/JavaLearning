package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 08.03.17.
 */
public class Task16_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        String[] words = Utilities.textToWords(text);
        int calcLetter = 0;
        for (int i = 0; i < words.length; i++) {
            char[] charArray = words[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == 'a' || charArray[j] == 'A') {
                    calcLetter++;
                }
            }
        }
        System.out.println("Letter 'a' met: " + calcLetter);
    }
}
