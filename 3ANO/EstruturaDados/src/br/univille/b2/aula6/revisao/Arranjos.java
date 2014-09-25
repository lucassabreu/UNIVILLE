package br.univille.b2.aula6.revisao;

public class Arranjos {

    public static void main(String[] args) {
        int[] x = { 3, 4, 7, 5, 8, 9, 14, 1, 15, 10 };

        int soma = 0;
        float centro = 0;

        for (int i = 0; i < x.length; i++)
            soma += x[i];

        if (x.length % 2 == 0) {
            centro = x[(x.length / 2)];
            centro += x[(x.length / 2) - 1];
            centro /= 2.0;
        } else
            centro = x[(x.length / 2)];

        System.out.println("Centro: " + centro);
        System.out.println("Soma: " + soma);
    }

}
