package HomeWork_Week3.Task3_10;

/**
 * Created by volodymyrkorniienko on 16.03.17.
 */
public class Password_Utils {

    public static void verifyPasswordLength(int length) {
        if (length >= 8 && length <= 20) {
            System.out.println("Length OK");
        } else {
            System.out.println("Invalid password - Must have from 8 to 20 symbols");
            System.exit(0);
        }
    }

    public static void verifyLowerSymbols(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Character.isLowerCase(array[i])) {
                System.out.println("Lower case OK");
            } else {
                System.out.println("Invalid password - Must have lower case letter");
            }
        }
    }

    public static void verifyUpperSymbols(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                System.out.println("Upper case OK");
            } else {
                System.out.println("Invalid password - Must have upper case letter");
            }
        }
    }

    public static void verifyDigit(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 0 && array[i] <=9) {
                System.out.println("Digit OK");
            } else {
                System.out.println("Invalid password - Must have from digits");
            }
        }
    }

    public static void verifyLevelPassword (String password) {
        String checkPassword = "password";
        String checkPass = "pass";
        String checkGfhjkm = "gfhjkm";

        if (password.equals(checkPassword) || password.equals(checkPass) || password.equals(checkGfhjkm)) {
            System.out.println("Invalid password very easy");
            System.exit(0);
        } else {
            System.out.println("Password level OK");
        }
    }
}
