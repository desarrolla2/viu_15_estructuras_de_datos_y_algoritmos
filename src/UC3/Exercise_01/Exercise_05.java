package UC3.Exercise_01;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[];
        int i;
        boolean increasing, decreasing;

        numbers = new int[10];
        increasing = false;
        decreasing = false;
        System.out.println("Leyendo números:");
        for (i = 0; i < 10; i++) {
            System.out.print("número: ");
            numbers[i] = scanner.nextInt();
        }
        /* # available values
         *
         * | increasing | decreasing | value           |
         * | ---------- | ---------- | --------------- |
         * | false      | false      | idénticos       |
         * | false      | true       | orden creciente |
         * | true       | false      | decreciente     |
         * | true       | true       | desordenado     |
         * | ---------- | ---------- | --------------- |
         */
        for (i = 0; i < 9; i++) // usamos i e i+1, por lo que la i solo podrá llegar hasta 8 (ó <9)
        {
            if (numbers[i] > numbers[i + 1]) { // en este momento es decreasing
                decreasing = true;
            }
            if (numbers[i] < numbers[i + 1]) { // en este momento es increasing
                increasing = true;
            }
        }
        if (increasing == true && decreasing == false) {
            System.out.println("Serie creciente.");
            return;
        }
        if (increasing == false && decreasing == true) {
            System.out.println("Serie decreciente.");
            return;
        }
        if (increasing == true && decreasing == true) {
            System.out.println("Serie desordenada.");
        }
        if (increasing == false && decreasing == false) {
            System.out.println("Todos los números iguales.");
        }
    }
}
