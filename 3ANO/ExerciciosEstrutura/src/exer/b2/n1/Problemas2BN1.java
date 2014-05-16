package exer.b2.n1;

import java.security.InvalidParameterException;

/**
 * Escreve o corpo dos métodos para resolver os problemas específicos
 * 
 * Entregar até o final da aula
 * 
 */
public class Problemas2BN1 {

    public static void main(String[] args) {
        System.out.println("É triangulo: " + validaTriangulo(10, 5, 3));
        System.out.println("Valor do abastecimento é: " + valorAbastecimento("A", 45.3f));
        System.out.println("Valor da compra é: " + valorCompra("nome do produto", 3, 25.5f));
        System.out.println("A média das notas é: " + mediaDeNotas(//
                        new float[] { 8.5f, 9.4f, 7f }));
        System.out.println("A média ponderada das notas é: " + mediaDeNotasPonderada(//
                        new float[] { 8.5f, 9.4f, 7f }, new int[] { 3, 5, 4 }));
        System.out.println("A soma é: " + somaDeValoresAcimaDaMedia(//
                        new int[] { 2, 5, 4, 7, 8, 1, 2, 10, 9, 12, 15, 3 }));
    }

    /**
     * Escreva um método que receba uma lista de valores inteiros e retorne a
     * soma dos valores maiores que a média de todos os valores
     * 
     * @param valores
     * @return retorna o valor da soma dos números maiores que a média
     */
    private static int somaDeValoresAcimaDaMedia(int[] valores) {
        int soma = 0, media = 0;

        for (int i = 0; i < valores.length; i++)
            soma += valores[i];

        media = soma / valores.length;
        soma = 0;

        for (int i = 0; i < valores.length; i++)
            if (valores[i] > media)
                soma += valores[i];

        return soma;
    }

    /**
     * Escreva um método que receba uma lista de notas e uma lista de pesos das
     * notas e calcule e retorne a média ponderada das notas.
     * 
     * @param notas
     * @param peso
     * @return retorna a média ponderada das notas
     */
    private static float mediaDeNotasPonderada(float[] notas, int[] peso) {
        int pesoTotal = 0;
        float soma = 0;

        if (peso.length != notas.length)
            throw new InvalidParameterException("Pesos não são em mesmo número das notas !");

        for (int i = 0; i < notas.length; i++) {
            pesoTotal += peso[i];
            soma += notas[i] * (float) peso[i];
        }

        if (pesoTotal <= 0)
            throw new InvalidParameterException("Soma dos pesos menor ou igual a zero !");

        return soma / (float) pesoTotal;
    }

    /**
     * Escreva um método que receba uma lista de notas e calcule e retorne a
     * média das notas
     * 
     * @param notas
     * @return retorna a méida das notas
     */
    private static float mediaDeNotas(float[] notas) {
        float soma = 0;

        if (notas.length == 0)
            return 0;

        for (int i = 0; i < notas.length; i++)
            soma += notas[i];

        return soma / (float) notas.length;
    }

    /**
     * Escreva um método que receba: a descrição do produto (nome), a quantidade
     * adquirida e o preço unitário. Calcular e retorne o total (total =
     * quantidade adquirida * preço unitário), o desconto e o total a pagar
     * (total a pagar = total - desconto), sabendo-se que se quantidade <= 5 o
     * desconto será de 2%, se quantidade > 5 e quantidade <=10 o desconto será
     * de 3% e se quantidade > 10 o desconto será de 5%
     * 
     * @param quantidade
     * @param valorUnitario
     * @return retorna o valor da compra
     */
    private static float valorCompra(String nome, int quantidade, float valorUnitario) {

        float desconto = 0, valorTotal = 0;

        valorTotal = quantidade * valorUnitario;

        if (quantidade <= 5f)
            desconto = .02f;
        else {
            if (quantidade <= 10)
                desconto = .03f;
            else
                desconto = .05f;
        }

        valorTotal -= (valorTotal * desconto);

        return valorTotal;
    }

    /**
     * Um posto está vendendo combustíveis com a seguinte descontos, Álcool, até
     * 20 litros, desconto de 3% por litro, acima de 20 litros, 5% de desconto,
     * e Gasolina, até 20 litros desconto de 4% por litro, acima de 20 litros,
     * desconto de 6% por litro. Escreva um método que receba como parâmetro o
     * número de litros vendidos e o tipo de combustível (codificado da seguinte
     * forma: A-álcool, G-gasolina), calcule e retorne o valor a ser pago pelo
     * cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço
     * do litro do álcool é R$ 2,90.
     * 
     * @param tipoCombustivel
     * @param litros
     * @return retorna o valor do abastecimento
     */
    private static float valorAbastecimento(String tipoCombustivel, float litros) {

        float desconto = 0, custoLitro = 0, valor = 0;
        
        if (tipoCombustivel.isEmpty())
            throw new InvalidParameterException("Deve ser informado um tipo de combustível !");

        switch (tipoCombustivel.charAt(0)) {
            case 'a':
            case 'A':
                custoLitro = 2.9f;
                
                if (litros <= 20f)
                    desconto = .03f;
                else 
                    desconto = .05f;
                
                break;
            case 'g':
            case 'G':
                custoLitro = 3.3f;

                if (litros <= 20f)
                    desconto = .04f;
                else 
                    desconto = .06f;
                
                break;
            default:
                throw new InvalidParameterException("Apenas podem ser informados os tipos A-álcool e G-gasolina !");
        }
        
        valor = custoLitro * litros;
        valor -= valor * desconto;

        return valor;
    }

    /**
     * Escreva um método que receba 3 valores inteiros (l1, l2 e l3)
     * representando as medidas dos lados de um triângulo e retorne um booleano
     * indicando se formam ou não um triângulo. OBS: para formar um triângulo, o
     * valor de cada lado deve ser menor que a soma dos outros 2
     * lados.(validaTriangulo)
     * 
     * @param l1
     * @param l2
     * @param l3
     * @return retorna verdadeiro se os 3 lados podem formar um triângulo
     */
    private static boolean validaTriangulo(int l1, int l2, int l3) {
        int lado[] = new int[] { l1, l2, l3 };

        for (int i = 0; i < lado.length; i++) {
            if (lado[i] > (lado[(i + 1) % 3] + lado[(i + 2) % 3]))
                return false;
        }

        return true;
    }

}