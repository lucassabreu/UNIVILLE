package exer.b4.n5;

import java.util.Arrays;

import exer.b4.n5.bt.BalancedBinaryTree;

public class Main {
    public static void main(String[] args) {
        BalancedBinaryTree bbt = new BalancedBinaryTree();

        int[] values = new int[] { 8, 9, 10 };

        for (int i : values)
            bbt.add(i);

        System.out.printf("Primeiro Teste: %s\n", Arrays.toString(values));
        bbt.print(System.out);

        bbt = new BalancedBinaryTree();

        values = new int[] { 11, 8, 12, 13, 9, 10 };

        for (int i : values)
            bbt.add(i);

        System.out.println();
        System.out.printf("Segundo Teste: %s\n", Arrays.toString(values));
        bbt.print(System.out);
    }
}
