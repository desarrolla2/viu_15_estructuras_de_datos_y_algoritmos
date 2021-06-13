package UC1;
import java.util.Scanner;

public class ValidateDate {
    public static void main(String[] args) {
        int day, month, year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca día: ");
        day = scanner.nextInt();

        System.out.print("Introduzca mes: ");
        month = scanner.nextInt();

        System.out.print("Introduzca año: ");
        year = scanner.nextInt();

        if (day < 1 || day > 30) {
            System.out.println("Día incorrecto");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("Mes incorrecto");
            return;
        }

        if (year == 0) {
            System.out.println("Año incorrecto");
            return;
        }

        System.out.println("Fecha correcta");
    }
}
