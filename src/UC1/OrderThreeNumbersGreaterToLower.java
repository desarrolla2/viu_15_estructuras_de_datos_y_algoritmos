package UC1;
import java.util.Scanner;

public class OrderThreeNumbersGreaterToLower {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca primer número: ");
        firstNumber = scanner.nextInt();

        System.out.print("Introduzca segundo número: ");
        secondNumber = scanner.nextInt();

        System.out.print("Introduzca tercer número: ");
        thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println(firstNumber + ", " + secondNumber + ", " + thirdNumber);
            return;
        }

        if (firstNumber > thirdNumber && thirdNumber > secondNumber) {
            System.out.println(firstNumber + ", " + thirdNumber + ", " + secondNumber);
            return;
        }
        if (secondNumber > firstNumber && firstNumber > thirdNumber) {
            System.out.println(secondNumber + ", " + firstNumber + ", " + thirdNumber);
            return;
        }
        if (secondNumber > thirdNumber && thirdNumber > firstNumber) {
            System.out.println(secondNumber + ", " + thirdNumber + ", " + firstNumber);
            return;
        }
        if (thirdNumber > firstNumber && firstNumber > secondNumber) {
            System.out.println(thirdNumber + ", " + firstNumber + ", " + secondNumber);
            return;
        }
        System.out.println(thirdNumber + ", " + secondNumber + ", " + firstNumber);
    }
}