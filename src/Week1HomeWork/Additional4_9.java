package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 23.02.17.
 */
public class Additional4_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your growth: ");
        double growth = sc.nextDouble();
        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();
        double idealWeight = growth - 100;

        if (idealWeight >= weight) {
            System.out.print("You beatiful!!!");
        }
        else {
            System.out.print("Go to gym!!!");
        }
    }
}
