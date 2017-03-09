package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 08.03.17.
 */
public class Task12_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter words: ");
        String words = scanner.nextLine();

        String reverse = new StringBuilder(words).reverse().toString();
        System.out.println(reverse);
    }
}
