package UC1;
import java.util.Scanner;

public class GetGradeString {
    public static void main(String[] args) {
        int grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca una nota: ");
        grade = scanner.nextInt();

        if (grade >= 0 && grade < 5) {
            System.out.println("INSUFICIENTE");
            return;
        }
        if (grade == 5) {
            System.out.println("SUFICIENTE");
            return;
        }
        if (grade == 6) {
            System.out.println("BIEN");
            return;
        }
        if (grade == 7 || grade == 8) {
            System.out.println("NOTABLE");
            return;
        }
        if (grade == 9 || grade == 10) {
            System.out.println("SOBRESALIENTE");
            return;
        }
    }
}
