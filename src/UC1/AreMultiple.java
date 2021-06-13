package UC1;
import java.util.Scanner;

public class AreMultiple {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        firstNumber = scanner.nextInt();

        System.out.print("Introduce otro número: ");
        secondNumber = scanner.nextInt();

        if (firstNumber % secondNumber == 0) {
            System.out.println("Son múltiplos");
            return;
        }
        System.out.println("No son múltiplos");
    }
}