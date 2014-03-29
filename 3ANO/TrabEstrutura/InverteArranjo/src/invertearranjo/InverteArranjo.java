package invertearranjo;

/*
 * Instruções:
 * 1 - —Escreva um algoritmo recursivo que inverta as posições de um arranjo a partir de uma posição i até a posição j.
 *      public static void doReverseArray(int[] a, int ini, int end)
 * 2 - —Escreva um algoritmo NÃO recursivo que inverta as posições de um arranjo a partir de uma posição i até a posição j.
 *      public static void doReverseArray(int[] a, int ini, int end)
 */
public class InverteArranjo {
    public static void doReverseArrayNotRecursive(int[] a, int ini, int end) {
        int temp = 0;
        if (ini < 0 || ini >= a.length || end < 0 || end >= a.length)
            throw new IndexOutOfBoundsException("Uma das posições informadas estão fora de faixa para o vetor.");
        
        for (; end > ini; end--, ini++) {
            temp = a[ini];
            a[ini] = a[end];
            a[end] = temp;
        }
            
    }

    public static void doReverseArrayRecursive(int[] a, int ini, int end) {
        if (ini < 0 || ini >= a.length || end < 0 || end >= a.length)
            throw new IndexOutOfBoundsException("Uma das posições informadas estão fora de faixa para o vetor.");
        
        if (end < ini)
            return;
        
        int temp = a[ini];
        a[ini] = a[end];
        a[end] = temp;
        
        doReverseArrayRecursive(a, ++ini, --end);
    }

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i != vetor.length - 1)
                System.out.print(", ");
        }

        System.out.println("]\n");

        int[] vetorAux = vetor.clone();
        doReverseArrayNotRecursive(vetorAux, 2, 9);

        System.out.print("Sem uso de recursão (2, 9): [");
        for (int i = 0; i < vetorAux.length; i++) {
            System.out.print(vetorAux[i]);
            if (i != vetorAux.length - 1)
                System.out.print(", ");
        }
        System.out.println("]\n");

        vetorAux = vetor.clone();
        doReverseArrayRecursive(vetorAux, 1, 10);

        System.out.print("Sem com uso de recursão: [");
        for (int i = 0; i < vetorAux.length; i++) {
            System.out.print(vetorAux[i]);
            if (i != vetorAux.length - 1)
                System.out.print(", ");
        }

        System.out.println("]");
    }
}
