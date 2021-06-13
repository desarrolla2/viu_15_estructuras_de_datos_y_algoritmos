package UC1;
import java.util.Scanner;

public class CalculateNumberString {

    public static void main(String[] args) {
        int number;
        int units, tens;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número (0 a 99): ");
        number = scanner.nextInt();

        units = number % 10;
        tens = number / 10;

        System.out.println(getTensAsString(tens) + " y " + getUnitsAsString(units));
    }

    private static String getUnitsAsString(int tens) {
        if (tens == 0) {
            return "";
        }
        if (tens == 1) {
            return "uno";
        }
        if (tens == 2) {
            return "dos";
        }
        if (tens == 3) {
            return "tres";
        }
        if (tens == 4) {
            return "cuatro";
        }
        if (tens == 5) {
            return "cinco";
        }
        if (tens == 6) {
            return "seis";
        }
        if (tens == 7) {
            return "siete";
        }
        if (tens == 8) {
            return "ocho";
        }
        return "nueve";
    }

    private static String getTensAsString(int tens) {
        if (tens == 0) {
            return "";
        }
        if (tens == 1) {
            return "diez";
        }
        if (tens == 2) {
            return "veinte";
        }
        if (tens == 3) {
            return "treinta";
        }
        if (tens == 4) {
            return "cuarenta";
        }
        if (tens == 5) {
            return "cincuenta";
        }
        if (tens == 6) {
            return "sesenta";
        }
        if (tens == 7) {
            return "setenta";
        }
        if (tens == 8) {
            return "ochenta";
        }
        return "noventa";
    }
}
