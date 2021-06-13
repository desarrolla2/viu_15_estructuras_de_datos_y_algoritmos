package UC2.Exercise_01;

import java.util.Scanner;

public class Example_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce número (de 0 a 10): ");
            num = scanner.nextInt();
        }
        while (!(0 <= num && num <= 10));
        System.out.println("\n\nTabla del " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
