package Examen.Exercise_03;

import Examen.Input;
import Examen.Output;

import java.util.ArrayList;

public class Exercise_03 {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        int m, n;
        output.println("Por favor indica las dimensiones de la matriz mxn");
        output.println("Indica el valor de m:");
        m = input.readInteger();
        output.println("Indica el valor de n:");
        n = input.readInteger();

        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                output.println("Indica el valor de la posición [" + i + "][" + j + "]");
                matrix[i][j] = input.readInteger();
            }
        }
        int max[] = {0, 0};
        int min[] = {0, 0};
        output.println("Esta es la matriz que has introducido:");
        for (int i = 0; i < m; i++) {
            output.print("[" + i + "][");
            for (int j = 0; j < n; j++) {
                output.print(matrix[i][j] + ", ");

                if (matrix[i][j] > matrix[max[0]][max[1]]) {
                    max[0] = i;
                    max[1] = j;
                }
                if (matrix[i][j] < matrix[min[0]][min[1]]) {
                    min[0] = i;
                    min[1] = j;
                }
            }
            output.println("]");
        }
        output.println("El mayor más grande (" + matrix[max[0]][max[1]] + ") se encuentra en la posición: [" + max[0] + ", " + max[1] + "]");
        output.println("El mayor más pequeño (" + matrix[min[0]][min[1]] + ") se encuentra en la posición: [" + min[0] + ", " + min[1] + "]");

    }
}
