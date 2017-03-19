package HomeWork_Week3.Task3_11;

import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 18.03.17.
 */
public class Biker {

    public static String buyMotorcycle(Bike bike) {
        if (bike.statusOrder == "Selling") {
            System.out.println("You can might buy this bike, cost: " + bike.cost);
            System.out.println("You want buy this bike?");
            Scanner scanner = new Scanner(System.in);
            boolean verify = scanner.nextBoolean();
            if (verify ==  true && bike.statusOrder == "Selling" && bike.statusOrder != "Fixing") {
                System.out.println("You buy motorcycle!");
                bike.statusOrder = "Sales";
            } else {
                System.out.println("Sorry!!!");
            }
        }
        return bike.statusOrder;
    }

    public static String sellMotorcycle(Bike bike) {
        System.out.println("You want sell this bike?");
        Scanner scanner = new Scanner(System.in);
        boolean verify = scanner.nextBoolean();
        if (verify == true && bike.statusOrder != "Selling" && bike.statusOrder != "Fixing") {
            System.out.println("You will sell your bike!");
            bike.statusOrder = "Selling";
        } else {
            System.out.println("Sorry");
        }

        return bike.statusOrder;
    }

    public static void checkBikeStatus(Bike bike) {
        System.out.println(bike.statusOrder);
    }

    public static String fixMotorcycle(Bike bike) {
        System.out.println("Yow want to fix your bike: ");
        Scanner scanner = new Scanner(System.in);
        boolean verify = scanner.nextBoolean();
        if (verify == true) {
            System.out.println("Your bike will be fixed!");
            bike.statusOrder = "Fixing";
        } else {
            System.out.println("Your bike fixed!");
            bike.statusOrder = "Fixed";
        }

        return bike.statusOrder;
    }
}
