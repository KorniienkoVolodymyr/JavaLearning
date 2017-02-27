package HomeWork_Week1;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 27.02.17.
 */
public class HomeWork_3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time:");
        int time = sc.nextInt();
        timeWork(time);
    }

    public static void timeWork(int time) {
        if (time >= 9 && time <= 18) {
            System.out.print("I am at work");
        } else if (time <= 9 && time >= 18) {
            System.out.print("I am relax");
        } else {
            System.out.print("Error data!!!");
        }
    }
}
