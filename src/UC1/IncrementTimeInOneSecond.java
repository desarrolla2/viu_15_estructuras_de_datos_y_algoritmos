package UC1;
import java.util.Scanner;

public class IncrementTimeInOneSecond {
    public static void main(String[] args) {
        int hours, minutes, seconds;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca hora: ");
        hours = scanner.nextInt();

        System.out.print("Introduzca minutos: ");
        minutes = scanner.nextInt();

        System.out.print("Introduzca segundos: ");
        seconds = scanner.nextInt();

        seconds++;

        if (seconds >= 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes >= 60) {
            minutes = 0;
            hours++;
        }
        if (hours >= 24) {
            hours = 0;
        }

        System.out.println("Fecha: " + hours + ":" + minutes + ":" + seconds);
    }
}

