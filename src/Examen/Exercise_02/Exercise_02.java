package Examen.Exercise_02;

import Examen.Input;
import Examen.Output;

public class Exercise_02 {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();


        output.println("Este programa calcula C(m,n)");
        output.println("Siendo C = m! / n!(m-n)!");
        output.println("Indica el valor de m:");
        int m = input.readInteger();
        output.println("Indica el valor de n:");
        int n = input.readInteger();
        int c = factorial(m) / (factorial(n) * factorial(m - n));


        output.println("El valor de C es " + c);

    }

    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
