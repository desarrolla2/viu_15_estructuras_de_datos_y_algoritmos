package UC2.Exercise_01;

import java.util.Scanner;

public class Example_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, num;
        System.out.print("Introduce un número: ");
        num = scanner.nextInt();
        i = 1;
        // i es el contador que tomará los valores de 1 a n
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
