package UC2.Exercise_01;

import java.util.Scanner;

public class Example_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Introduzca un número: ");
        number = scanner.nextInt();
        while (number != 0) // mientras num sea distinto de 0
        {
            if (number % 2 == 0)
                // si el resto de dividir entre dos es cero: esto indica que es par
                System.out.println("Par");
            else
                // en caso contrario: impar
                System.out.println("Impar");
            // repetimos el proceso y volvemos a leer num
            System.out.print("Introduzca otro número: ");
            number = scanner.nextInt();
        }// al salir del mientras tenemos la certeza que num es 0
    }
}
