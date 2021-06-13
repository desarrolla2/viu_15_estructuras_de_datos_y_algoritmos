package UC3.Exercise_01;

import java.util.Scanner;

public class Example_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca un número: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Los números (en orden inverso):");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}


