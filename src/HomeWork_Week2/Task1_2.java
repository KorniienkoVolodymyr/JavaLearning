package HomeWork_Week2;

/**
 * Created by volodymyrkorniienko on 05.03.17.
 */
public class Task1_2 {
    public static void main(String[] args) {

        for (int i = 35; i <= 87 ; i++) {
            if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5) {
                System.out.print(i + " ");
            }
        }
    }
}
