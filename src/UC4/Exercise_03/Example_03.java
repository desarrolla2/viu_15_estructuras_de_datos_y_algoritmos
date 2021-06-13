package UC4.Exercise_03;

import UC4.Exercise_02.Client;
import UC4.Exercise_02.Output;

import java.util.LinkedList;
import java.util.Random;

public class Example_03 {
    public static void main(String[] args) {
        Output output = new Output();
        LinkedList<Client> queue1 = new LinkedList<Client>();
        LinkedList<Client> queue2 = new LinkedList<Client>();
        LinkedList<Client> queue3 = new LinkedList<Client>();
        int eightHoursInMinutes = 60 * 8;
        int totalAttendedClientsInQueue1 = 0;
        int totalAttendedClientsInQueue2 = 0;
        int totalAttendedClientsInQueue3 = 0;
        int totalNotAttendedClients = 0;
        int totalMinutesInQueue = 0;
        int minutesUntilArrivalNextClient = calculateMinutesArrivalNextClient();
        int minutesUntilNextClientWillBeAttendedInQueue1 = calculateMinutesNextClientWillBeAttended();
        int minutesUntilNextClientWillBeAttendedInQueue2 = calculateMinutesNextClientWillBeAttended();
        int minutesUntilNextClientWillBeAttendedInQueue3 = calculateMinutesNextClientWillBeAttended();
        for (int currentMinute = 0; currentMinute < eightHoursInMinutes; currentMinute++) {
            if (minutesUntilArrivalNextClient <= 0) {
                Client client = new Client();
                client.setArrivalMinute(currentMinute);
                minutesUntilArrivalNextClient = calculateMinutesArrivalNextClient();
                LinkedList<Client> smallestQueue = getSmallestQueue(queue1, queue2, queue3);
                if (smallestQueue.size() < 6) {
                    smallestQueue.offer(client);
                }
                if (smallestQueue.size() >= 6) {
                    totalNotAttendedClients++;
                }
            }

            if (minutesUntilNextClientWillBeAttendedInQueue1 <= 0 && queue1.size() > 0) {
                Client client = queue1.poll();
                totalMinutesInQueue += currentMinute - client.getArrivalMinute();
                totalAttendedClientsInQueue1++;
                minutesUntilNextClientWillBeAttendedInQueue1 = calculateMinutesNextClientWillBeAttended();
            }
            if (minutesUntilNextClientWillBeAttendedInQueue2 <= 0 && queue2.size() > 0) {
                Client client = queue2.poll();
                totalMinutesInQueue += currentMinute - client.getArrivalMinute();
                totalAttendedClientsInQueue2++;
                minutesUntilNextClientWillBeAttendedInQueue2 = calculateMinutesNextClientWillBeAttended();
            }
            if (minutesUntilNextClientWillBeAttendedInQueue3 <= 0 && queue3.size() > 0) {
                Client client = queue3.poll();
                totalMinutesInQueue += currentMinute - client.getArrivalMinute();
                totalAttendedClientsInQueue3++;
                minutesUntilNextClientWillBeAttendedInQueue3 = calculateMinutesNextClientWillBeAttended();
            }

            minutesUntilArrivalNextClient--;
            minutesUntilNextClientWillBeAttendedInQueue1--;
            minutesUntilNextClientWillBeAttendedInQueue2--;
            minutesUntilNextClientWillBeAttendedInQueue3--;
        }
        int totalAttendedClients = totalAttendedClientsInQueue1 + totalAttendedClientsInQueue2 + totalAttendedClientsInQueue3;
        float averageMinutesInQueue = Math.round((float) totalMinutesInQueue / totalAttendedClients * 100f) / 100f;

        output.println("En total fueron atendidos " + totalAttendedClients + " clientes");
        output.println("En la caja 1 fueron atendidos " + totalAttendedClientsInQueue1 + " clientes");
        output.println("En la caja 2 fueron atendidos " + totalAttendedClientsInQueue2 + " clientes");
        output.println("En la caja 3 fueron atendidos " + totalAttendedClientsInQueue3 + " clientes");
        output.println("Se marcharon sin ser atendidos " + totalNotAttendedClients + " clientes");
        output.println("El tiempo promedio fue de  " + averageMinutesInQueue + " minutos");
    }

    private static LinkedList<Client> getSmallestQueue(LinkedList<Client> queue1, LinkedList<Client> queue2, LinkedList<Client> queue3) {
        if (queue1.size() <= queue2.size()) {
            if (queue1.size() <= queue3.size()) {
                return queue1;
            }
            return queue3;
        }
        if (queue2.size() <= queue3.size()) {
            return queue2;
        }
        return queue3;
    }

    private static Integer calculateMinutesNextClientWillBeAttended() {
        return generateRandomIntegerBetween(7, 11);
    }

    private static Integer calculateMinutesArrivalNextClient() {
        return generateRandomIntegerBetween(2, 3);
    }

    private static Integer generateRandomIntegerBetween(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
