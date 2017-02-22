package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 22.02.17.
 */
public class Additional4_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        if (month == 0 || month >=13 )
        {
            System.out.print("Error!!!");
        }
        else if (month <= 2 || month == 12) {
            System.out.print("Winter!");
        }
        else if (month >= 3 && month <= 5) {
            System.out.print("Spring!");
        }
        else if (month >= 6 && month <= 8) {
            System.out.print("Summer!");
        }
        else if (month >= 9 && month <= 11) {
            System.out.print("Autumn!");
        }
    }
}
