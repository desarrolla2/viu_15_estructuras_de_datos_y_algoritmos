package UC2.Exercise_01;

import java.util.Scanner;

public class Example_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber, sumOfAllNumbers;
        sumOfAllNumbers = 0;
        do {
            System.out.print("Introduzca un número: ");
            currentNumber = scanner.nextInt();
            sumOfAllNumbers = sumOfAllNumbers + currentNumber;
        }
        while (currentNumber != 0);
        System.out.println("La suma de todos los números es: " + sumOfAllNumbers);
    }
}
