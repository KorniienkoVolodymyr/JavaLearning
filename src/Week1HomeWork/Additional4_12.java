package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 23.02.17.
 */
public class Additional4_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed of wind: ");
        int speedWind = sc.nextInt();

        if (speedWind >= 1 && speedWind <= 4) {
            System.out.print("Weak wind");
        }
        else if (speedWind >= 5 && speedWind <= 10) {
            System.out.print("Moderate wind");
        }
        else if (speedWind >= 9 && speedWind <= 18) {
            System.out.print("Strong wind");
        }
        else if (speedWind > 19) {
            System.out.print("Hurricane");
        }
        else {
            System.out.print("Calm");
        }
    }
}
