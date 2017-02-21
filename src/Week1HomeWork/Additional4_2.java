package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 22.02.17.
 */
public class Additional4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        double a = sc.nextDouble();
        System.out.print("Second number: ");
        double b = sc.nextDouble();
        System.out.print("Third number: ");
        double c = sc.nextDouble();

        if (a > 0) {
            a = Math.pow(a, 2);
            System.out.println("First number = : " + a);
        }
            else if (a <= 0) {
            a = 0;
            System.out.println("First number = : " + a);

        }

        if (b > 0) {
            b = Math.pow(b, 2);
            System.out.println("Second number = : " + b);
        }
            else if (b <= 0) {
                b = 0;
                System.out.println("Second number = : " + b);
        }

        if (c > 0) {
            c = Math.pow(c , 2);
            System.out.println("Third number = : " + c);
        }
        else {
            c = 0;
            System.out.println("Third number = : " + c);
        }
    }
}
