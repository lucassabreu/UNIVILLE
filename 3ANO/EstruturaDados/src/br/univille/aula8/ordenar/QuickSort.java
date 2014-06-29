package br.univille.aula8.ordenar;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int valores[] = { 3, 7, 5, 4, 1, 8, 9, 2, 6 };

        quickSort(valores, 0, valores.length);

        System.out.println(Arrays.toString(valores));
    }

    public static void quickSort(int[] arranjo, int start, int end) {

        int medio = (start + end) / 2;

        for (int i = start; i < medio; i++) {
            if (arranjo[i] > arranjo[medio]) {
                int temp = arranjo[medio];
                arranjo[medio] = arranjo[i];
                arranjo[i] = temp;
            }
        }

        for (int i = medio + 1; i < end; i++) {
            if (arranjo[i] < arranjo[medio]) {
                int temp = arranjo[medio];
                arranjo[medio] = arranjo[i];
                arranjo[i] = temp;
            }
        }

        if (start + 2 < end) {
            quickSort(arranjo, start, medio + 1);
            quickSort(arranjo, medio, end);
        }
    }

}
