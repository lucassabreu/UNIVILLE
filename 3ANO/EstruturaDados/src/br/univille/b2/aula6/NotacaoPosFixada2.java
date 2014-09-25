package br.univille.b2.aula6;

import br.univille.b2.aula5.pilha.ArrayStack;

public class NotacaoPosFixada2 {

    public static String converterParaPosFixada(String expr) {
        return converterParaPosFixada(expr.trim().toCharArray());
    }

    public static String converterParaPosFixada(char[] expr) {

        ArrayStack<Integer> numeros = new ArrayStack<>();
        ArrayStack<Character> operadores = new ArrayStack<>();
        Integer num = 0;

        for (int i = 0; i < expr.length; i++) {
            switch (expr[i]) {
                case ' ':
                    if (!numeros.isEmpty() && numeros.top() != null)
                        numeros.push(null);
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    if (!numeros.isEmpty()) {
                        num = numeros.pop();
                        if (num == null)
                            num = 0;
                    } else
                        num = 0;
                    numeros.push(num * 10 //
                                    + Integer.valueOf(String
                                                    .format("%c", expr[i])));
                    break;
                case '+':
                case '-':
                    operadores.push(expr[i]);
                    break;
            }
        }

        return numeros.toString();
    }

    public static void main(String[] args) {
        System.out.println(converterParaPosFixada("25 + 2"));
    }

}
