package UC1;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        number = scanner.nextInt();
        if (number < 10) {
            System.out.println("tiene 1 cifra");
            return;
        }
        if (number < 100) {
            System.out.println("tiene 2 cifras");
            return;
        }
        if (number < 1000) {
            System.out.println("tiene 3 cifras");
            return;
        }
        if (number < 10000) {
            System.out.println("tiene 4 cifras");
            return;
        }
        if (number < 100000) {
            System.out.println("tiene 5 cifras");
            return;
        }
    }
}
