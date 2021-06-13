package UC1;
import java.util.Scanner;

public class SetDigitsInReverseOrder {
    public static void main(String[] args) {
        int number;
        int tensOfThousands, thousands, hundreds, tens, units;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        number = scanner.nextInt();

        units = number % 10;
        number = number / 10;

        tens = number % 10;
        number = number / 10;

        hundreds = number % 10;
        number = number / 10;

        thousands = number % 10;
        number = number / 10;

        tensOfThousands = number;

        System.out.println(units + " " + tens + " " + hundreds + " " + thousands + " " + tensOfThousands);
    }
}

