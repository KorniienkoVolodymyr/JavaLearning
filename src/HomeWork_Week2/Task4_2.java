package HomeWork_Week2;
import java.util.Scanner;

/**
 * Created by volodymyrkorniienko on 06.03.17.
 */
public class Task4_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = scanner.nextInt();
        int[] array = Utilities.converterToMas(number);
        Utilities.maxValueInArray(array);
    }
}
