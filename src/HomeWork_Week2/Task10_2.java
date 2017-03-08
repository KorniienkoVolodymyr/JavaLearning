package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 06.03.17.
 */
public class Task10_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String text = scanner.nextLine();

        String[] words = Utilities.textToWords(text);
        char[] charArray = words[2].toCharArray();
        System.out.println("First letter in third word is " + charArray[0]);
    }
}
