package exer.b4.n2.bt;

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

    public int getMaxDintance() {

        int maxLeftDistance = 0;
        int maxRightDistance = 0;

        if (this.left != null)
            maxLeftDistance = this.left.getMaxDintance() + 1;

        if (this.right != null)
            maxRightDistance = this.right.getMaxDintance() + 1;

        if (maxLeftDistance > maxRightDistance)
            return maxLeftDistance;
        else
            return maxRightDistance;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value) + this.getLeft() + this.getRight();
    }
}
