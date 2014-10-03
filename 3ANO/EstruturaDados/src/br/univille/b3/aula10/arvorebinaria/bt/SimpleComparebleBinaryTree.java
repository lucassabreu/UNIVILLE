package br.univille.b3.aula10.arvorebinaria.bt;

public class SimpleComparebleBinaryTree<T extends Comparable<T>> implements
                IBinaryTree<T> {

    private int         size;
    private Position<T> root;

    public SimpleComparebleBinaryTree() {}

    @Override
    public void add(T value) {
        if (value == null)
            throw new RuntimeException("Deve ser informado um valor não nulo !");

        if (this.root == null)
            this.root = this.createPosition(value, null);
        else
            this.addTo(value, this.root);
    }

    protected void addTo(T value, Position<T> position) {

        if (position.getValue().equals(value))
            return;

        if (position.getValue().compareTo(value) > 0) {

            if (position.getLeft() == null)
                position.setLeft(this.createPosition(value, position));
            else
                this.addTo(value, position.getLeft());

        } else {

            if (position.getRight() == null)
                position.setRight(this.createPosition(value, position));
            else
                this.addTo(value, position.getRight());

        }
    }

    protected Position<T> createPosition(T value, Position<T> parent) {
        this.size++;
        return new Position<T>(value, parent);
    }

    @Override
    public void list() {
        this.listPosition(this.root);
    }

    protected void listPosition(Position<T> position) {
        if (position == null)
            return;

        listPosition(position.getLeft());
        System.out.println(position.getValue());
        listPosition(position.getRight());
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return this.root.toString();
    }
}
