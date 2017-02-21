package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 22.02.17.
 */
public class Additional4_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers per hour: ");
        double kilometers = sc.nextDouble();
        System.out.print("Enter meters per second: ");
        double meters = sc.nextDouble() / 0.27;

        if (kilometers > meters) {
            System.out.print("Kilometers per hour " + kilometers + " bigger then meters! " + meters);
        }
        else {
            System.out.print("Meters per hour " + meters + " bigger then kilometers! " + kilometers);
        }
    }
}
