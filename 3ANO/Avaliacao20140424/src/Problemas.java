import java.util.Arrays;

/**
 * Escreve o corpo dos métodos para resolver os problemas específicos
 * Observações: O Array utilizado é apenas um exemplo, o sistema deve funcionar
 * com um array populado com qualquer valor e qualquer quantidade de números
 * 
 */
public class Problemas {

    public static void main(String[] args) {
        int valores[] = new int[] { 16, 14, 5, 4, 25, 19, 12, 7, 20, 3, 17, 18,
                22, 2, 1 };

        System.out.println("Soma de todos os valores: " + somaTodos(valores));
        System.out.println("Soma os valores das posições pares: " + somaPosicoesPares(valores));
        System.out.println("Soma os valores das posições impares: " + somaPosicoesImpares(valores));
        System.out.println("Soma todos os valores pares: " + somaValoresPares(valores));
        System.out.println("Soma todos os valores impares: " + somaValoresImpares(valores));
        System.out.println("Valores ordenados: " //
                        + Arrays.toString(ordenaValores(valores)));
    }

    private static int somaTodos(int valores[]) {
        /*
         * @TODO Codificar método que soma todos os valores do array e retorne
         * um valor numérico inteiro
         */

        int soma = 0;

        for (int i = 0; i < valores.length; i++)
            soma += valores[i];

        return soma;
    }

    private static int somaPosicoesPares(int valores[]) {
        /*
         * @TODO Codificar método que soma todos os valores do array que estão
         * nas posições pares do array (Ex, 0, 2, 4, 6, etc) e retorne um valor
         * numérico inteiro
         */

        int soma = 0;

        for (int i = 0; i < valores.length; i += 2)
            soma += valores[i];

        return soma;
    }

    private static int somaPosicoesImpares(int valores[]) {
        /*
         * @TODO Codificar método que soma todos os valores do array que estão
         * nas posições impares do array (Ex, 1, 3, 5, 7, etc) e retorne um
         * valor numérico inteiro
         */

        int soma = 0;

        for (int i = 1; i < valores.length; i += 2)
            soma += valores[i];

        return soma;
    }

    private static int somaValoresPares(int valores[]) {
        /*
         * @TODO Codificar método que soma todos os valores impares do array
         * (Ex, 16, 14, 4, 20, etc) e retorne um valor numérico inteiro
         */

        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0)
                soma += valores[i];
        }

        return soma;
    }

    private static int somaValoresImpares(int valores[]) {
        /*
         * @TODO Codificar método que soma todos os valores impares do array
         * (Ex, 5, 25, 19, 7, etc) e retorne um valor numérico inteiro
         */

        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 != 0)
                soma += valores[i];
        }

        return soma;
    }

    private static int[] ordenaValores(int valores[]) {
        /*
         * @TODO Codificar método que ordena os valores em ordem crescente no
         * array e retorna o array ordenado
         */

        int temp = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = i; j < valores.length; j++) {
                if (valores[i] > valores[j]) {
                    temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }

        return valores;
    }

}
