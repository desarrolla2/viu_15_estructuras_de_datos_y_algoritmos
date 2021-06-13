package UC3.Exercise_01;

import java.util.Scanner;

public class Example_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, t[];
        t = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Introduzca numero: ");
            t[i] = scanner.nextInt();
        }

        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(t[i]); // mostramos el i-ésimo número por el principio
            System.out.println(t[9 - i]); // y el i-ésimo por el final
        }// como en cada vuelta de for se muestran dos números
        // para mostrarlos todos, solo necesitaremos la mitad de vueltas.
    }
}
