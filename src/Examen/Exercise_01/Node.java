package Examen.Exercise_01;

public class Node {
    Node child;
    Node father;
    Node mother;
    String name;

    public int getLevel() {
        if (child == null) {
            return 0;
        }
        return child.getLevel() + 1;
    }

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getChild() {
        return child;
    }

    public void setChild(Node child) {
        this.child = child;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
        father.setChild(this);
    }

    public Node getMother() {
        return mother;
    }

    public void setMother(Node mother) {
        this.mother = mother;
        mother.setChild(this);
    }
}
