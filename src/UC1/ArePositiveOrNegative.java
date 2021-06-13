package UC1;
import java.util.Scanner;

public class ArePositiveOrNegative {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negativo");
            return;
        }
        System.out.println("Positivo");
    }
}
