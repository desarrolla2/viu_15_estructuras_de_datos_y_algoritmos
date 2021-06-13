package UC2.Exercise_01;

import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad, media_edad, suma_edad, mayor_edad, mayor_175; //mayor_edad: mayores de 18 años
        double altura, media_altura, suma_alt;
        mayor_edad = 0;
        media_altura = 0;
        mayor_175 = 0;
        suma_edad = 0;
        suma_alt = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.print("Introduzca edad: ");
            edad = scanner.nextInt();
            System.out.print("Introduzca altura: ");
            altura = scanner.nextDouble();
            if (edad > 18)
                mayor_edad++;
            if (altura > 1.75)
                mayor_175++;
            suma_edad = suma_edad + edad;
            suma_alt = suma_alt + altura;
        }
        media_edad = suma_edad / 5;
        media_altura = suma_alt / 5;
        System.out.println("\n\nLa edad media es de: " + media_edad);
        System.out.println("La altura media es de: " + media_altura);
        System.out.println("Mayor de 18 años: " + mayor_edad);
        System.out.println("Mayor de 1.75: " + mayor_175);
    }
}
