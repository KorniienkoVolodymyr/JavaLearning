package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 23.02.17.
 */
public class Additional4_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cents: ");
        int cents = sc.nextInt();
        cents = cents;
        String cent = "Копе";

        if (cents >= 11 && cents <= 20) {
            System.out.print(cent +"ек");
        }
        else if (cents == 1 || cents % 10 == 1) {
            System.out.print(cent +"йка");
        }
        else if (cents >= 2 && cents <= 4 || cents % 10 >= 2 && cents % 10 <= 4) {
            System.out.print(cent +"йки");
        }
        else {
            System.out.print(cent +"ек");
        }
    }
}
