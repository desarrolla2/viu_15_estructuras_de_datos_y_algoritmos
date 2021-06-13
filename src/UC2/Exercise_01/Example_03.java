package UC2.Exercise_01;

import java.util.Scanner;

public class Example_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, contador;
        // num guardará los números introducidos
        // y contador se incrementará para llevar la cuenta de los números introducidos
        System.out.print("Introduzca un número: ");
        number = scanner.nextInt();
        contador = 0; // al comienzo el número de números introducidos es 0
        while (number > 0) // mientras num sea positiva
        {
            // contador toma el valor que tuviera en este momento más uno
            // en definitiva: contador se incrementa en uno
            contador = contador + 1;
            System.out.print("Introduzca otro número: ");
            number = scanner.nextInt();
        }
        System.out.println("Se han introducido: " + contador + " números");
        // sin tener en cuenta el último número negativo.
    }
}
