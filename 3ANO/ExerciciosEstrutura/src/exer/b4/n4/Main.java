package exer.b4.n4;

import exer.b4.n4.bt.BalancedBinaryTree;

public class Main {
    public static void main(String[] args) {
        BalancedBinaryTree bbt = new BalancedBinaryTree();

        int[] values = { 10, 9, 8 };

        for (int i : values)
            bbt.add(i);

        bbt.print(System.out);
    }
}
