package br.univille.b3.aula10.arvorebinaria;

import br.univille.b3.aula10.arvorebinaria.bt.IBinaryTree;
import br.univille.b3.aula10.arvorebinaria.bt.SimpleComparebleBinaryTree;

public class Main {
    public static void main(String[] args) {

        IBinaryTree<Integer> bt = new SimpleComparebleBinaryTree<Integer>();

        while (bt.size() < 20) {
            bt.add((int) (Math.random() * 100));
        }

        bt.list();

    }
}
