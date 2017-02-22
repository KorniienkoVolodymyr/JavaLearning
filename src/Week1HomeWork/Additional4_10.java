package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 23.02.17.
 */
public class Additional4_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hourCost = 250;
        System.out.print("Enter day of week: ");
        int dayOfWeek = sc.nextInt();
        System.out.print("How long: ");
        double time = sc.nextDouble();
        double price = hourCost * time;
        double sale = (price * 20) / 100;

        if (dayOfWeek >=1 && dayOfWeek <= 5) {
            System.out.print("Cost: " + price);
        }
        else if (dayOfWeek == 6 || dayOfWeek == 7){
            price = price - sale;
            System.out.print("Cost: " + price);
        }
        else {
            System.out.print("Incorrect data!");
        }
    }
}
