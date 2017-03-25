package HomeWork_Week3.Task3_10;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 16.03.17.
 */
public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter password: ");
        String password = scanner.nextLine();
        int passwordLength = password.length();
        char[] passwordArray = password.toCharArray();

        Password_Utils.verifyPasswordLength(passwordLength);
        Password_Utils.verifyLowerSymbols(passwordArray);
        Password_Utils.verifyUpperSymbols(passwordArray);
        Password_Utils.verifyDigit(passwordArray);
        Password_Utils.verifyLevelPassword(password);

        System.out.println("Confirm enter password: ");
        String confirmPassword = scanner.nextLine();



    }
}
