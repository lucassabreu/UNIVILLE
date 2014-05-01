package br.univille.aula6.revisao;

import java.util.Arrays;

public class OperacoesArranjos {
    public int soma(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++)
            soma += v[i];
        return soma;
    }

    public float mediana(int[] v) {
        float mediana = 0;

        if (v.length % 2 == 0) {
            mediana = v[v.length / 2];
            mediana += v[(v.length / 2) - 1];
            mediana /= 2.0;
        } else
            mediana = v[v.length / 2];

        return mediana;
    }

    public void ordena(int[] v) {
        int aux = 0;

        for (int i = 0, j = 0; i < v.length; i++) {
            for (j = i; j < v.length; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] v = { 9, 8, 5, 6, 7, 4, 1, 3, 2, 0 };
        
        

        OperacoesArranjos c = new OperacoesArranjos();

        System.out.printf("Vetor: %s\n", Arrays.toString(v));

        System.out.printf("Soma: %s\n", c.soma(v));
        System.out.printf("Mediana: %s\n", c.mediana(v));

        c.ordena(v);
        System.out.printf("Ordenado: %s\n", Arrays.toString(v));
    }
}
