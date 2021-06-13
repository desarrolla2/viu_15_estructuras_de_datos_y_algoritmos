package Examen.Exercise_01;

import Examen.Input;
import Examen.Output;

import java.util.ArrayList;

public class Exercise_01 {
    private static Input input;
    private static Output output;
    private static ArrayList<Node> nodes;

    public static void main(String[] args) {
        input = new Input();
        output = new Output();

        Node root = createRootNode();
        dump(root);
    }

    private static Node createRootNode() {
        output.println("Vas a introducir un árbol genealógico");
        output.println("El primer nodo es obligatorio");
        output.println("A continuación tendrás que introducir los nombres de los PADRES y las MADRES de cada nodo.");
        output.println("Introduce una cadena 'no' para indicar que no quieres introducir un nodo.");
        output.println("Por favor introduce el nombre del primer nodo");
        String name = input.readString();
        Node root = new Node(name);
        addParents(root);
        return root;
    }

    private static void addParents(Node root) {
        Node father = addFather(root);
        Node mother = addMother(root);
        if (father != null) {
            addParents(father);
        }
        if (mother != null) {
            addParents(mother);
        }
    }

    private static Node addMother(Node root) {
        output.println("Por favor introduce el nombre de la MADRE de '" + root.getName() + "'");
        output.println("Introduce 'no' para dejar este nodo vacío.");
        String name = input.readString();
        if (name.toLowerCase().equals("no")) {
            output.println("'" + root.getName() + "' no tiene MADRE.");
            return null;
        }
        output.println("La MADRE de '" + root.getName() + "' se llama '" + name + "'");
        Node mother = new Node(name);
        root.setMother(mother);
        return mother;
    }

    private static Node addFather(Node root) {
        output.println("Por favor introduce el nombre del PADRE de '" + root.getName() + "'");
        output.println("Introduce 'no' para dejar este nodo vacío.");
        String name = input.readString();
        if (name.toLowerCase().equals("no")) {
            output.println("'" + root.getName() + "' no tiene PADRE.");
            return null;

        }
        output.println("El PADRE de '" + root.getName() + "' se llama '" + name + "'");
        Node father = new Node(name);
        root.setFather(father);
        return father;
    }

    private static void dump(Node node) {
        dumpRow(node);
        if (node.getFather() != null) {
            dump(node.getFather());
        }
        if (node.getMother() != null) {
            dump(node.getMother());
        }
    }

    private static void dumpRow(Node node) {
        if (node.getLevel() == 0) {
            output.println("A continuación puedes ver el árbol genealógico que has introducido:");
            output.println(node.getName());
            return;
        }
        output.println("|" + String.format("%-" + node.getLevel() * 4 + "s", "") + "└" + node.getName());
    }
}
