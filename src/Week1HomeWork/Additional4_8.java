package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 22.02.17.
 */
public class Additional4_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost: ");
        double cost = sc.nextDouble();
        double discount = cost / 10;

        if (cost >= 1000) {
            cost = cost - discount;
            System.out.print("You have discount 10%, your price: " + cost);
        }
        else {
            System.out.print("Your price: " + cost);
        }
    }
}
