package UC2.Exercise_01;

import java.util.Scanner;

public class Example_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToBeHit, numberEnteredByUser;
        // n es el número que hay que acertar
        // num guarda los números introducidos
        numberToBeHit = (int) (Math.random() * 100) + 1;
        // en lugar de pedir n... podemos hacer que se n tome un valor
        // aleatorio entre 1 y 100.
        // Así el juego es algo más entretenido.
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
