package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 19.02.17.
 */
public class Task4_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter double number: ");
        double number = sc.nextDouble();
        boolean result = number > 0 && number < 1;

        if (result) {
            System.out.print("Cool: " + result);
        }
        else {
            System.out.print("Sorry: " + result);
        }
    }
}
