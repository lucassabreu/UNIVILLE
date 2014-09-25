package br.univille.b2.aula4.somabinaria;

public class BinarySum {

    public static void main(String[] args) {
        int[] v = { 20, 45, 07, 15, 32, 03, 22, 10 };

        int soma = 0;
        for (int i = 0; i < v.length; i++)
            soma += v[i];

        System.out.println("Valor Esperado: " + soma);
        System.out.println("Valor Soma: " + BinarySum.calcSomaBinaria(v, 0, 8));

    }

    public static int calcSomaBinaria(int[] vNumeros, int inicio, int tamanho) {
        System.out.println("ini: " + inicio + " end: " + tamanho);
        if (tamanho == 1) {
            System.out.println("\tValor: " + vNumeros[inicio]);
            return vNumeros[inicio];
        }

        return BinarySum.calcSomaBinaria(vNumeros, inicio, tamanho / 2) + //
                        BinarySum.calcSomaBinaria(vNumeros, inicio + (tamanho / 2), tamanho / 2);
    }
}
