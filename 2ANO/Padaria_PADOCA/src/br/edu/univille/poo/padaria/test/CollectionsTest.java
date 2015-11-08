package br.edu.univille.poo.padaria.test;

import java.util.ArrayList;

public class CollectionsTest {

    /**
     * @param args
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        ArrayList colecao = new ArrayList<>();

        colecao.add("univille");
        colecao.add(123);
        colecao.add(true);

        for (int i = 0; i < colecao.size(); i++) {
            System.out.println(colecao.get(i));
        }

        System.out.println(String.format("Tamanho: %d", colecao.size()));

        for (int i = colecao.size() - 1; i >= 0; i--) {
            System.out.println(colecao.remove(i));
        }

        // while (!colecao.isEmpty()) {
        // System.out.println(colecao.remove(0));
        // }

        System.out.println(String.format("Tamanho: %d", colecao.size()));

        // System.out.println(colecao);
    }

}
