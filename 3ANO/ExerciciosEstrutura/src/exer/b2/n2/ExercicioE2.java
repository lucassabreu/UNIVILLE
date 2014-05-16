package exer.b2.n2;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class ExercicioE2 {

    public static void main(String[] args) {
        System.out.printf("Valor IMC: %.2f\n", calculaIMC(99.0f, 1.7f));
        System.out.printf("1 Metro em polegadas: %.2f\n", converteMetrosParaPolegadas(1));

        int valores[] = { 5, 6, 8, 7, 1, 9, 5 };
        System.out.printf("Posição menor no vetor %s: %d\n", //
                        Arrays.toString(valores), retornaPosicaoMenorValor(valores));
        System.out.printf("Um ano, 2 meses e 3 dias em dias: %d\n", idadeEmDias(1, 2, 3));

        valores = new int[] { 1, 2, 3, 4 };
        System.out.printf("Tomando o conjunto %s, a propriedade distributiva é: %s\n", //
                        Arrays.toString(valores), //
                        Arrays.toString(propriedadeDistributiva(valores)));
    }

    /**
     * O Índice de Massa Corporal é calculado por: IMC = P/(A*A), onde P é o
     * peso em kg e A é a altura em metros. E o resultado indica a situação do
     * indivíduo que pode ser classicado como:
     * 
     * - Abaixo de 17 Muito abaixo do peso
     * 
     * - Entre 17 e 18,49 Abaixo do peso
     * 
     * - Entre 18,5 e 24,99 Peso normal
     * 
     * - Entre 25 e 29,99 Acima do peso
     * 
     * - Entre 30 e 34,99 Obesidade I
     * 
     * - Entre 35 e 39,99 Obesidade II (severa)
     * 
     * - Acima de 40 Obesidade III (mórbida)
     * 
     * Construa um programa que calcule o IMC de uma pessoa onde serão
     * informados o peso e a altura.
     * 
     * @param peso
     *            - peso em kg
     * @param altura
     *            - altura em metros
     * @return IMC
     */
    public static float calculaIMC(float peso, float altura) {
        return peso / (altura * altura);
    }

    /**
     * Um profissional precisa de um software que converta valores em metros
     * para valores em polegadas. Sabendo que 1 metro equivale a 39,3700787
     * polegadas, crie um programa que faça essa conversão.
     * 
     * @param metros
     *            - valor em metros a ser convertido
     * @return - retorna
     */
    public static float converteMetrosParaPolegadas(float metros) {
        return metros * 39.3700787f;
    }

    /**
     * Dado um array de valores inteiro e sem valores repetidos, retorne a
     * posição do valor
     * 
     * @param valores
     *            - Valores inteiros sem repetição
     * @return - posição do menor valor no array
     */
    public static int retornaPosicaoMenorValor(int[] valores) {
        int posMenor = 0;

        for (int i = 0; i < valores.length; i++)
            if (valores[i] < valores[posMenor])
                posMenor = i;

        return posMenor;
    }

    /**
     * Calcule a idade em dias, dado as informações em anos, meses e dias.
     * Considerar ano com 365 dias e mês com 30 dias.
     * 
     * @param anos
     *            - valor representando os anos da idade
     * @param meses
     *            - valor representando os meses que não completaram um 1 ano, o
     *            valor pode ser 0 até 11
     * @param dias
     *            - valor representando os dias que não completaram um mês, o
     *            valor pode ser 0 até 29
     * @return
     */
    public static int idadeEmDias(int anos, int meses, int dias) {
        return anos * 365 + meses * 30 + dias;
    }

    /**
     * Dado um array de números inteiros, retorne um array contendo a
     * multiplicação entre os valores aplicando a propriedade distributiva, ou
     * seja, se forem dado 4 valores, A, B, C e D, devem ser multiplicados os
     * pares A com B, A com C e A com D; B com C, B com D e por último C com D.
     */
    public static int[] propriedadeDistributiva(int[] valores) {
        int numeroMultiplicacoes = 0, pos = 0;
        int retorno[], tamanho = 0;

        if (valores.length < 2)
            throw new InvalidParameterException("O conjunto deve 2 ou mais elementos !");
        tamanho = (valores.length * (valores.length - 1)) / 2;

        retorno = new int[tamanho];

        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++, pos++) {
                retorno[pos] = valores[i] * valores[j];
            }
        }

        return retorno;
    }
}