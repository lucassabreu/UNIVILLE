package exer.b4.n2.bt;

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

            if (position.getRight() == null) {

                position.setRight(this.createPosition(value, position));
            } else
                this.addTo(value, position.getRight());

        }
    }

    protected Position<T> createPosition(T value, Position<T> parent) {
        this.size++;
        return new Position<T>(value, parent);
    }

    @Override
    public void listPreOrder() {
        this.listPreOrderPosition(this.root);
    }

    @Override
    public void listInOrder() {
        this.listInOrderPosition(this.root);
    }

    @Override
    public void listPosOrder() {
        this.listPosOrderPosition(this.root);
    }

    protected void listPreOrderPosition(Position<T> position) {
        if (position == null)
            return;

        this.printPosition(position);
        this.listPreOrderPosition(position.getLeft());
        this.listPreOrderPosition(position.getRight());
    }

    protected void listPosOrderPosition(Position<T> position) {
        if (position == null)
            return;

        this.listPosOrderPosition(position.getLeft());
        this.listPosOrderPosition(position.getRight());
        this.printPosition(position);
    }

    protected void listInOrderPosition(Position<T> position) {
        if (position == null)
            return;

        this.listInOrderPosition(position.getLeft());
        this.printPosition(position);
        this.listInOrderPosition(position.getRight());
    }

    protected void printPosition(Position<T> p) {
        System.out.printf("%s (%d), ", p.getValue(), p.getMaxDintance());
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return String.valueOf(this.root);
    }
}
