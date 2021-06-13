package UC2.Exercise_01;

import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Introduzca un número: ");
        number = scanner.nextInt();
        while (number != 0) // mientras num sea distinto de 0
        {
            if (number > 0)
                // mayor que cero: positivo
                System.out.println("Positivo");
            else
                // si no es positivo: es negativo
                System.out.println("Negativo");
            // repetimos el proceso y volvemos a leer num
            System.out.print("Introduzca otro número: ");
            number = scanner.nextInt();
        } // al salir del mientras tenemos la certeza que num es 0

    }
}
