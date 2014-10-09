package exer.b4.n1;

import exer.b4.n1.bt.IBinaryTree;
import exer.b4.n1.bt.SimpleComparebleBinaryTree;

public class Main {
    public static void main(String[] args) {

        IBinaryTree<Integer> bt = new SimpleComparebleBinaryTree<Integer>();

        while (bt.size() < 20) {
            bt.add((int) (Math.random() * 100));
        }

        bt.list();

    }
}
