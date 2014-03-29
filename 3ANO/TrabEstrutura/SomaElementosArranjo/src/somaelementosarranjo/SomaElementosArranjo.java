package somaelementosarranjo;

/*
 * Instruções:
 * 1 - —Escreva um algoritmo que de forma recursiva, calcule a soma do(s) n elemento(s) do arranjo acima.
 *      public static int calcLinearSum(int[] a, int num)
 * 2 - —Escreva um algoritmo que de forma NÃO recursiva, calcule a soma do(s) n elemento(s) do arranjo acima.
 *      public static int calcLinearSum(int[] a, int num)
 */
public class SomaElementosArranjo {

    public static int calcLinearSumNaoRecursiva(int[] a, int num) {
        int soma = 0;

        if (num > 0 && num >= a.length)
            throw new IndexOutOfBoundsException(String
                            .format("Index %d não existe", num));

        for (int i = 0; i < num; i++)
            soma += a[i];
        return soma;
    }

    public static int calcLinearSumRecursiva(int[] a, int num) {
        if (num > 0 && num >= a.length)
            throw new IndexOutOfBoundsException(String
                            .format("Index %d não existe", num));

        if (num == 1)
            return a[num - 1];
        else
            return a[num - 1] + calcLinearSumNaoRecursiva(a, num - 1);
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5 };

        System.out.print("Vetor: [");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (nums.length - 1 != i)
                System.out.print(", ");
        }

        System.out.println("]");

        System.out.println("Resultado da soma por não recursiva (3): " + SomaElementosArranjo
                        .calcLinearSumNaoRecursiva(nums, 3));
        System.out.println("Resultado da soma por recursiva (4): " + SomaElementosArranjo
                        .calcLinearSumRecursiva(nums, 4));
    }
}
