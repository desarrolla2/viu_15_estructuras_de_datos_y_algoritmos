package UC1;
import java.util.Scanner;

public class CalculateDateDifferenceInDays {
    public static void main(String[] args) {
        int firstDay, firstMonth, firstYear;
        int secondDay, secondMonth, secondYear;
        int differenceInDays;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fecha 1:");
        System.out.print("Introduzca día: ");
        firstDay = scanner.nextInt();

        System.out.print("Introduzca mes: ");
        firstMonth = scanner.nextInt();

        System.out.print("Introduzca año: ");
        firstYear = scanner.nextInt();

        System.out.println("Fecha 2:");
        System.out.print("Introduzca día: ");
        secondDay = scanner.nextInt();

        System.out.print("Introduzca mes: ");
        secondMonth = scanner.nextInt();

        System.out.print("Introduzca año: ");
        secondYear = scanner.nextInt();

        differenceInDays = secondDay - firstDay + 30 * (secondMonth - firstMonth) + 365 * (secondYear - firstYear);
        System.out.println("Días de diferencia: " + differenceInDays);
    }
}

