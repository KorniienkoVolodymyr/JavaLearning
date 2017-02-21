package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 21.02.17.
 */
public class Additional4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("Right triangle!");
        }
        else {
            System.out.println("Not right triangle!");
        }
    }
}
