package exer.b4.n4.bt;

import java.io.PrintStream;

public class BalancedBinaryTree implements IBinaryTree {

    protected Position root;
    protected int      size;

    @Override
    public void add(Integer value) {
        if (this.root == null)
            this.root = this.createPosition(null, value);
        else
            this.addToPosition(this.root, value);
    }

    public void addToPosition(Position position, int value) {
        if (position == null)
            return;

        int maxDistanceLeft = 0;
        int maxDistanceRight = 0;

        if (value > position.getValue()) {
            if (position.getRight() == null) {
                position.setRight(this.createPosition(position, value));
            } else {
                this.addToPosition(position.getRight(), value);
            }
        } else {
            if (position.getLeft() == null) {
                position.setLeft(this.createPosition(position, value));
            } else {
                this.addToPosition(position.getLeft(), value);
            }
        }

        if (position.getLeft() != null)
            maxDistanceLeft = position.getLeft().getMaxDistance() + 1;

        if (position.getRight() != null)
            maxDistanceRight = position.getRight().getMaxDistance() + 1;

        position.setBalance(maxDistanceLeft - maxDistanceRight);

        if (maxDistanceRight > maxDistanceLeft)
            position.setMaxDistance(maxDistanceRight);
        else
            position.setMaxDistance(maxDistanceLeft);

    }

    protected Position createPosition(Position top, int value) {
        Position position = new Position();

        position.setTop(top);
        position.setValue(value);
        this.size++;

        return position;
    }

    @Override
    public void print(PrintStream out) {
        StringBuilder sb = new StringBuilder();
        this.listPreOrderPosition(this.root, sb);
        out.print(sb);
    }

    protected void listPreOrderPosition(Position posicao, StringBuilder sb) {
        if (posicao == null)
            return;

        sb.append(posicao.getValue()).append(' ') //
                        .append(posicao.getMaxDistance()).append(' ') //
                        .append(posicao.getBalance()).append('\n');
        this.listPreOrderPosition(posicao.getLeft(), sb);
        this.listPreOrderPosition(posicao.getRight(), sb);
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.valueOf(this.root);
    }
}
