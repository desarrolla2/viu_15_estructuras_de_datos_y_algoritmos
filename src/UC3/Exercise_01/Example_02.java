package UC3.Exercise_01;

import java.util.Scanner;

public class Example_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers[] = new int[5];
        int sum_of_positive_numbers, number_of_positive_numbers, sum_of_negative_numbers, number_of_negative_numbers, number_of_zeros;

        sum_of_positive_numbers = 0;
        number_of_positive_numbers = 0;
        sum_of_negative_numbers = 0;
        number_of_negative_numbers = 0;
        number_of_zeros = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca un número: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numbers[i] == 0) {
                number_of_zeros++;
                continue;
            }
            if (numbers[i] > 0) {
                sum_of_positive_numbers = sum_of_positive_numbers + numbers[i];
                number_of_positive_numbers++;
                continue;
            }
            sum_of_negative_numbers = sum_of_negative_numbers + numbers[i];
            number_of_negative_numbers++;
        }

        printMeanOfPositiveNumbers(number_of_positive_numbers, sum_of_positive_numbers);
        printMeanOfNegativeNumbers(number_of_negative_numbers, sum_of_negative_numbers);
        printNumberOfZeros(number_of_zeros);
    }

    private static void printNumberOfZeros(int number_of_zeros) {
        System.out.println("La cantidad de cero es de: " + number_of_zeros);
    }

    private static void printMeanOfNegativeNumbers(int number_of_negative_numbers, int sum_of_negative_numbers) {
        if (number_of_negative_numbers == 0) {
            System.out.println("No se puede realizar la media de números negativos");
            return;
        }
        System.out.println("La media de los negativos: " + sum_of_negative_numbers / number_of_negative_numbers);
    }

    private static void printMeanOfPositiveNumbers(int number_of_positive_numbers, int sum_of_positive_numbers) {
        if (number_of_positive_numbers == 0) {
            System.out.println("No se puede realizar la media de números positivos");
            return;
        }
        System.out.println("La media de los positivos: " + sum_of_positive_numbers / number_of_positive_numbers);
    }
}
