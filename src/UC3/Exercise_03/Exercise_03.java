package UC3.Exercise_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise_03 {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        ArrayList<Participant> participants = new ArrayList<Participant>();
        int option;

        //initialize(participants);

        do {
            option = chooseOption(input, output);
            if (option == 1) {
                createParticipant(participants, input, output);
                continue;
            }
            if (option == 2) {
                showParticipantsByPosition(participants, output);
                continue;
            }
            if (option == 3) {
                showParticipantsByMarkIn2002(participants, output);
            }

        } while (option < 4);

        showByeMessage(output);
    }

    private static void initialize(ArrayList<Participant> participants) {
        Participant participant5 = new Participant();
        participant5.setName("Fernando");
        participant5.setMarkOf2002(5f);
        participants.add(participant5);

        Participant participant1 = new Participant();
        participant1.setName("Carlos");
        participant1.setMarkOf2002(2f);
        participants.add(participant1);

        Participant participant2 = new Participant();
        participant2.setName("Daniel");
        participant2.setMarkOf2002(1f);
        participants.add(participant2);

        Participant participant3 = new Participant();
        participant3.setName("Alvaro");
        participant3.setMarkOf2002(3f);
        participants.add(participant3);

        Participant participant4 = new Participant();
        participant4.setName("Jaime");
        participant4.setMarkOf2002(4f);
        participants.add(participant4);
    }

    private static void showByeMessage(Output output) {
        output.println("");
        output.println(" Cerrando el programa.");
    }

    private static void showParticipantsByMarkIn2002(ArrayList<Participant> participants, Output output) {
        ArrayList<Participant> participantsSortedByMarkIn2020 = new ArrayList<Participant>(participants);
        Collections.sort(participantsSortedByMarkIn2020, new Comparator<Participant>() {
            @Override
            public int compare(Participant participant_1, Participant participant_2) {
                if (participant_1.getMarkOf2002() == participant_2.getMarkOf2002()) {
                    return 0;
                }
                return participant_1.getMarkOf2002() > participant_2.getMarkOf2002() ? 1 : -1;
            }
        });

        output.println("");
        output.println(" Has seleccionado mostrar la lista de participantes por marca (año 2002).");
        output.println("");

        for (int idx = 0; idx < participantsSortedByMarkIn2020.size(); idx++) {
            Participant participant = participantsSortedByMarkIn2020.get(idx);
            output.println("> Marca " + participant.getMarkOf2002() + ":\t " + participant.getName());
        }
    }

    private static void showParticipantsByPosition(ArrayList<Participant> participants, Output output) {
        output.println("");
        output.println(" Has seleccionado mostrar la lista de participantes por dorsal.");
        output.println("");

        for (int idx = 0; idx < participants.size(); idx++) {
            Participant participant = participants.get(idx);
            output.println("> Dorsal " + idx + ":\t " + participant.getName());
        }
    }

    private static void createParticipant(ArrayList<Participant> participants, Input input, Output output) {

        if (participants.size() >= 10) {
            output.println("");
            output.println(" No hay más espacio disponible");
            return;
        }

        Participant participant = new Participant();

        output.println("");
        output.println(" Has seleccionado añadir un nuevo participante.");
        output.println("");
        output.println("Indica los siguientes valores");
        output.println("> Nombre.");
        output.print("> ");
        participant.setName(input.readString());

        output.println("> Mejor marca del 2002");
        output.print("> ");
        participant.setMarkOf2002(input.readFloat());

        output.println("> Mejor marca del 2001");
        output.print("> ");
        participant.setMarkOf2001(input.readFloat());

        output.println("> Mejor marca del 2000");
        output.print("> ");

        participant.setMarkOf2000(input.readFloat());
        participants.add(participant);

        output.println("> Se le ha asignado el dorsal : " + participants.indexOf(participant));
    }

    private static int chooseOption(Input input, Output output) {
        int option;
        output.println("");
        output.println("Selecciona una de las siguientes opciones:");
        output.println("> 1. Inscribir un participante.");
        output.println("> 2. Mostrar listado ordenado por dorsal.");
        output.println("> 3. Mostrar listado ordenado por marcas (año 2002).");
        output.println("> 4. Finalizar el programa.");
        output.print("> ");

        option = input.readInteger();
        if (option < 1 || option > 4) {
            output.println("Opcion seleccionada no válida");
            return chooseOption(input, output);
        }

        return option;
    }


}
