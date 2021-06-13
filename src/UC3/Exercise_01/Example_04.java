package UC3.Exercise_01;

import java.util.Scanner;

public class Example_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrix_1[], matrix_2[], matrix_3[];
        int i, j;
        int size = 10;
        matrix_1 = new int[size];
        matrix_2 = new int[size];
        matrix_3 = new int[size * 2];
        System.out.println("Leyendo la tabla a");
        for (i = 0; i < 10; i++) {
            System.out.print("número: ");
            matrix_1[i] = scanner.nextInt();
        }
        System.out.println("Leyendo la tabla b");
        for (i = 0; i < 10; i++) {
            System.out.print("número: ");
            matrix_2[i] = scanner.nextInt();
        }
        // asignaremos los elementos de la tabla c
        // para las tablas a y b utilizaremos como índice i
        // y para la tabla c utilizaremos como índice j.
        j = 0;
        for (i = 0; i < 10; i++) {
            matrix_3[j] = matrix_1[i];
            j++;
            matrix_3[j] = matrix_2[i];
            j++;
        }
        System.out.println("La tabla c queda: ");
        for (j = 0; j < 20; j++) // seguimos utilizando j, para la tabla c. Aunque se podría utilizar i.
            System.out.print(matrix_3[j] + " ");
        System.out.println("");
    }
}
