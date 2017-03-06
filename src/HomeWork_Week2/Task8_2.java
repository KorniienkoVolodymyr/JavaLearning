package HomeWork_Week2;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 06.03.17.
 */
public class Task8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Monday");
            System.out.println("2. Tuesday");
            System.out.println("3. Wednesday");
            System.out.println("4. Thursday");
            System.out.println("5. Friday");
            System.out.println("6. Saturday");
            System.out.println("7. Sunday");

            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    Monday();
                    break;
                case "2":
                    Tuesday();
                    break;
                case "3":
                    Wednesday();
                    break;
                case "4":
                    Thursday();
                    break;
                case "5":
                    Friday();
                    break;
                case "6":
                    Saturday();
                    break;
                case "7":
                    Sunday();
                    break;
                default:
                    System.out.println("Wrong chose!!!");
            }
        }
    }

    public static void Monday () {
        System.out.println("Hard working!");
    }

    public static void Tuesday () {
        System.out.println("UEFA Champions League!");
    }

    public static void Wednesday () {
        System.out.println("UEFA Champions League!");
    }

    public static void Thursday () {
        System.out.println("UEFA Europe League!");
    }

    public static void Friday () {
        System.out.println("English!");
    }

    public static void Saturday () {
        System.out.println("JAVA!");
    }

    public static void Sunday () {
        System.out.println("JAVA!");
    }
}
