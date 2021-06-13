package UC2.Exercise_01;

import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, suma_total;
        suma_total = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduzca número: ");
            num = scanner.nextInt();
            suma_total = suma_total + num;
        }
        System.out.println("La suma total es de: " + suma_total);
    }
}
