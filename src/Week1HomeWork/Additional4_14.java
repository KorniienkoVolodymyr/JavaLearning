package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 23.02.17.
 */
public class Additional4_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter six numbers: ");
        int numbers = sc.nextInt();
        int first = numbers / 100000;
        int second = (numbers / 10000) % 10;
        int three = (numbers / 1000) % 10;
        int four = (numbers % 1000) / 100;
        int five = (numbers % 100) / 10 ;
        int six = numbers % 10;

        if (first + second + three == four + five + six) {
            System.out.print("Lucky!!!");
        }
        else {
            System.out.print("Looser!!!");
        }
    }
}
