package UC2.Exercise_01;

import java.util.Scanner;

public class Example_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberEnteredByUser, sumOfAllNumbers, numberOfElements;
        float average; // la media puede tener decimales
        // num: guardará los números introducidos por el usuario
        // suma: almacenará la suma de todos los números introducidos
        // elementos: será un contador que indicará el números de números 8o elementos) introducidos
        System.out.print("Introduzca un número: ");
        numberEnteredByUser = scanner.nextInt();
        sumOfAllNumbers = numberOfElements = 0;
        while (numberEnteredByUser >= 0) // nos interesan los positivos y el cero
        {
            sumOfAllNumbers += numberEnteredByUser;
            numberOfElements++;
            System.out.print("Introduzca otro número: ");
            numberEnteredByUser = scanner.nextInt();
        }
        if (numberOfElements == 0) // daría un error de división por cero
            System.out.println("Imposible hacer la media");
        else {
            average = (float) sumOfAllNumbers / numberOfElements;
            System.out.println("La media es de: " + average);
        }
    }
}
