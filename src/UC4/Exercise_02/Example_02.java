package UC4.Exercise_02;

import java.util.LinkedList;
import java.util.Random;

public class Example_02 {
    public static void main(String[] args) {
        Output output = new Output();
        LinkedList<Client> queue = new LinkedList<Client>();
        int tenHoursInMinutes = 60 * 10;
        int totalAttendedClients = 0;
        int minutesUntilArrivalNextClient = calculateMinutesArrivalNextClient();
        int minutesUntilNextClientWillBeAttended = calculateMinutesNextClientWillBeAttended();
        for (int currentMinute = 0; currentMinute < tenHoursInMinutes; currentMinute++) {
            if (minutesUntilArrivalNextClient <= 0) {
                Client client = new Client();
                client.setArrivalMinute(currentMinute);
                queue.offer(client);
                minutesUntilArrivalNextClient = calculateMinutesArrivalNextClient();
            }
            if (minutesUntilNextClientWillBeAttended <= 0 && queue.size() > 0) {
                queue.poll();
                totalAttendedClients++;
                minutesUntilNextClientWillBeAttended = calculateMinutesNextClientWillBeAttended();
            }

            minutesUntilArrivalNextClient--;
            minutesUntilNextClientWillBeAttended--;
        }

        output.println("Han sido atendidos " + totalAttendedClients + " clientes");
        if (queue.size() == 0) {
            output.println("No quedan clientes en la cola");
            return;
        }
        Client nextClient = queue.peek();
        output.println("En la cola quedan " + queue.size() + " clientes");
        output.println("El próximo cliente llego en el minuto " + nextClient.getArrivalMinute());

    }

    private static Integer calculateMinutesNextClientWillBeAttended() {
        return generateRandomIntegerBetween(2, 4);
    }

    private static Integer calculateMinutesArrivalNextClient() {
        return generateRandomIntegerBetween(2, 3);
    }

    private static Integer generateRandomIntegerBetween(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
