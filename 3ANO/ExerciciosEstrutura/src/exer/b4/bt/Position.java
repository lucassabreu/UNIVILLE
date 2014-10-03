package exer.b4.bt;

public class Position<E> {

    private E           value;
    private Position<E> left;
    private Position<E> right;
    private Position<E> parent;

    public Position() {}

    public Position(E value) {
        this.setValue(value);
    }

    public Position(E value, Position<E> parent) {
        this(value);
        this.setParent(parent);
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Position<E> getLeft() {
        return left;
    }

    public void setLeft(Position<E> left) {
        this.left = left;
    }

    public Position<E> getRight() {
        return right;
    }

    public void setRight(Position<E> right) {
        this.right = right;
    }

    public Position<E> getParent() {
        return parent;
    }

    public void setParent(Position<E> parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return this.value.toString() //
                        .concat(this.getLeft().toString()) //
                        .concat(this.getRight().toString());
    }

}
