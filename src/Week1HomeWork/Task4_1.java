package Week1HomeWork;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 19.02.17.
 */
public class Task4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time:");
        int time = sc.nextInt();

        if (time >= 9 && time <=18){
            System.out.print("I am at work");
        }
        else if (time <= 9 || time >=18){
            System.out.print("I am relax");
        }
        else {
            System.out.print("Error data!!!");
        }
    }
}
