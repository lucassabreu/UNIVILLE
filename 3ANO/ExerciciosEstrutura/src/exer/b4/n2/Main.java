package exer.b4.n2;

import exer.b4.n2.bt.IBinaryTree;
import exer.b4.n2.bt.SimpleComparebleBinaryTree;

public class Main {
    public static void main(String[] args) {

        IBinaryTree<Character> bt = new SimpleComparebleBinaryTree<Character>();

        char[] letters = { 'D', 'B', 'F', 'A', 'C', 'E', 'G' };
        // char[] letters = { 'D', 'B', 'A', 'C', 'F', 'E', 'G' };
        // char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };

        for (int i = 0; i < letters.length; i++)
            bt.add(letters[i]);

        System.out.println("#####################");
        System.out.println("Pre-Ordem:");
        bt.listPreOrder();
        System.out.println();

        System.out.println("#####################");
        System.out.println("Pos-Ordem:");
        bt.listPosOrder();
        System.out.println();

        System.out.println("#####################");
        System.out.println("In-Ordem:");
        bt.listInOrder();

    }
}
