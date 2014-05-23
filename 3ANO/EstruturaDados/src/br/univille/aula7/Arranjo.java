package br.univille.aula7;

import java.util.Arrays;

public class Arranjo {
    public static int MAX_SIZE = 20;

    private int[]     values;
    private int       index;

    public Arranjo() {
        this.values = new int[MAX_SIZE];
        this.index = 0;
    }

    public void add(int value) {
        if (this.index >= this.values.length) {
            throw new IndexOutOfBoundsException("O número máximo de elementos já foi atingido !");
        }

        this.values[this.index++] = value;
    }

    public void add(int value, int index) {
        if (this.index >= this.values.length)
            throw new IndexOutOfBoundsException("O número máximo de elementos já foi atingido !");

        if (index < 0 || index > this.index)
            throw new IndexOutOfBoundsException(String
                            .format("Posição deve estar entre 0 e %d !", this.index));

        for (int i = this.index; i > index; i--)
            this.values[i] = this.values[i - 1];

        this.index++;
        this.values[index] = value;
    }

    public int remove() {
        if (this.index <= 0)
            throw new IndexOutOfBoundsException("Não existem elementos para serem removidos !");

        return this.values[--this.index];
    }

    public int remove(int index) {
        if (index < 0 || index >= this.index)
            throw new IndexOutOfBoundsException(String
                            .format("Item na posição %d, não existe !", index));

        this.index--;
        int elem = this.values[index];
        for (int i = index; i < this.index; i++)
            this.values[i] = this.values[i + 1];

        return elem;
    }

    public int[] list() {
        int[] list = new int[this.index];

        for (int i = 0; i < this.index; i++)
            list[i] = this.values[i];

        return list;
    }

    public int size() {
        return this.index;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list());
    }

    public static void main(String[] args) {
        Arranjo arr = new Arranjo();

        System.out.printf("Arranjo vazio: %s\n", arr.toString());
        arr.add(1);
        System.out.printf("Elemento 1 adicionado: %s\n", arr.toString());
        arr.add(2);
        System.out.printf("Elemento 2 adicionado: %s\n", arr.toString());
        arr.add(3);
        System.out.printf("Elemento 2 adicionado: %s\n", arr.toString());
        System.out.printf("Remover ultimo elemento {Elemento: %d, Arranjo: %s}\n", //
                        arr.remove(), arr.toString());
        System.out.printf("Lista os elementos: %s\n", //
                        Arrays.toString(arr.list()));
        arr.add(4);
        System.out.printf("Elemento 4 adicionado: %s\n", arr.toString());
        arr.add(5);
        System.out.printf("Elemento 5 adicionado: %s\n", arr.toString());
        System.out.printf("Remover ultimo elemento {Elemento: %d, Arranjo: %s}\n", //
                        arr.remove(), arr.toString());
        System.out.printf("Remover ultimo elemento {Elemento: %d, Arranjo: %s}\n", //
                        arr.remove(), arr.toString());
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        System.out.printf("Elementos 4, 5, 6, 7 adicionados: %s\n", arr
                        .toString());
        System.out.printf("Remover elemento 2 {Elemento: %d, Arranjo: %s}\n", //
                        arr.remove(2), arr.toString());
        System.out.printf("Remover elemento 2 {Elemento: %d, Arranjo: %s}\n", //
                        arr.remove(2), arr.toString());

        System.out.printf("Lista os elementos: %s\n", //
                        Arrays.toString(arr.list()));
        arr.add(9, 2);
        System.out.printf("Adicionar elemento 9 em 2: %s\n", arr.toString());
        arr.add(0, 0);
        System.out.printf("Adicionar elemento 0 em 0: %s\n", arr.toString());
        arr.add(100, arr.size());
        System.out.printf("Adicionar elemento 100 em %d: %s\n", arr.size(), arr.toString());

        try {
            System.out.printf("Adicionar 1 em %d (MAX_SIZE): ", Arranjo.MAX_SIZE);
            arr.add(1, Arranjo.MAX_SIZE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.printf("Remover posição %d (MAX_SIZE): ", Arranjo.MAX_SIZE);
            arr.remove(Arranjo.MAX_SIZE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
