package UC2.Exercise_01;

import java.util.Scanner;

public class Example_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToBeHit, numberEnteredByUser;
        // n es el número que hay que acertar
        // num guarda los números introducidos
        System.out.print("Introduce N: ");
        numberToBeHit = scanner.nextInt();
        System.out.print("Introduce número: ");
        numberEnteredByUser = scanner.nextInt();
        while (numberEnteredByUser != numberToBeHit) // mientras no coincidan ambos números
        {
            if (numberEnteredByUser > numberToBeHit)
                System.out.println("menor");
            else
                System.out.println("mayor");
            System.out.print("Introduce número: ");
            numberEnteredByUser = scanner.nextInt();
        }
        // al salir del mientras tenemos la certeza que num es igual a n
        System.out.println("acertaste...");
    }
}
