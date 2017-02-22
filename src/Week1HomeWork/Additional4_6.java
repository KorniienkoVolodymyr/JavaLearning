package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 22.02.17.
 */
public class Additional4_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed: ");
        double speed = sc.nextDouble();
        System.out.print("Enter distance: ");
        double distance = sc.nextDouble();

        double time = distance/speed;
        System.out.print("Travel time: " + time);
    }
}
