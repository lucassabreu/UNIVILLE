package exer.b4.n4.bt;

import java.io.PrintStream;

public class BalancedBinaryTree implements IBinaryTree {

    protected Position root;
    protected int      size;

    @Override
    public void add(Integer value) {
        if (this.root == null)
            this.root = this.createPosition(value);
        else {
            this.root = this.addToPosition(this.root, //
                            this.createPosition(value));
            this.root.setTop(null);
        }
    }

    public Position addToPosition(Position position, Position newOne) {

        if (position == null)
            position = newOne;
        else {
            if (newOne.getValue() > position.getValue()) {
                position.setRight(this
                                .addToPosition(position.getRight(), newOne));
                position.getRight().setTop(position);
            } else {
                position.setLeft(this.addToPosition(position.getLeft(), newOne));
                position.getLeft().setTop(position);
            }
        }

        this.recalcBalance(position);

        if (position.getBalance() > 1) {
            position = this.rotateRight(position);
            this.recalcBalance(position);
        } else {
            if (position.getBalance() < -1) {
                position = this.rotateLeft(position);
                this.recalcBalance(position);
            }
        }

        return position;
    }

    public void recalcBalance(Position position) {

        int maxDistanceLeft = 0;
        int maxDistanceRight = 0;

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

    public Position rotateRight(Position pos) {
        Position left = pos.getLeft();
        pos.setLeft(null);
        left.setRight(this.addToPosition(left.getRight(), pos));
        return left;
    }

    public Position rotateLeft(Position pos) {
        Position right = pos.getRight();
        pos.setRight(null);
        right.setLeft(this.addToPosition(right.getLeft(), pos));
        return right;
    }

    protected Position createPosition(Integer value) {
        Position position = new Position();

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

    protected void listPreOrderPosition(Position position, StringBuilder sb) {
        if (position == null)
            return;

        System.out.print(position.getValue() + " ");
        System.out.print(position.getMaxDistance() + " ");
        System.out.println(position.getBalance());

        listPreOrderPosition(position.getLeft(), sb);
        listPreOrderPosition(position.getRight(), sb);

        /*
         * sb.append(position.getValue()).append(' ') //
         * .append(position.getMaxDistance()).append(' ') //
         * .append(position.getBalance()).append('\n');
         * this.listPreOrderPosition(position.getLeft(), sb);
         * this.listPreOrderPosition(position.getRight(), sb);
         */
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.valueOf(this.root);
    }
}
