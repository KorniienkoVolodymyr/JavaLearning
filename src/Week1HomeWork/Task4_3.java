package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 19.02.17.
 */
public class Task4_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: " );
        int number = sc.nextInt();

        if (number % 7 == 0) {
            number *= number;
            System.out.println("Number = " + number);
        }
        else {
            System.out.println("Number not divisible by 7");
        }
    }
}
