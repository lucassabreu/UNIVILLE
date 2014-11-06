package exer.b4.n4.bt;

public class Position {
    private Position left;
    private Position right;
    private Position top;
    private int      value = 0;

    private int      maxDistance;
    private int      balance;

    public Position rotateRight() {
        Position left = this.left;
        left.right = this;
        return left;
    }

    public int getValue() {
        return value;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Position getLeft() {
        return left;
    }

    public void setLeft(Position left) {
        this.left = left;
    }

    public Position getRight() {
        return right;
    }

    public void setRight(Position right) {
        this.right = right;
    }

    public Position getTop() {
        return top;
    }

    public void setTop(Position top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return "[" + String.valueOf(value) + ", " + String.valueOf(this.left) + ", " + String
                        .valueOf(this.right) + "]";
    }

}
