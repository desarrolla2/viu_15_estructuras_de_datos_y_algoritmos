package UC1;
import java.util.Scanner;

public class OrderTwoNumbersGreaterToLower {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        firstNumber = scanner.nextInt();

        System.out.print("Introduce otro número: ");
        secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " y " + secondNumber);
        }
        System.out.println(secondNumber + " y " + firstNumber);
    }
}
