package br.univille.aula5.exer;

import br.univille.aula5.pilha.ArrayStack;

public class ParenMatch {

    public static boolean parenMatch(char[] x, int n) {

        ArrayStack<Character> parenteses = new ArrayStack<>();
        ArrayStack<Character> colchetes = new ArrayStack<>();
        ArrayStack<Character> chaves = new ArrayStack<>();

        for (int i = 0; i < n; i++) {
            if (x[i] == '(')
                parenteses.push(x[i]);
            else {
                if (x[i] == '[')
                    colchetes.push(x[i]);
                else {
                    if (x[i] == '{')
                        chaves.push(x[i]);
                    else {
                        if (x[i] == ')') {
                            if (parenteses.isEmpty())
                                return false;
                            else
                                parenteses.pop();
                        } else {
                            if (x[i] == ']') {
                                if (colchetes.isEmpty())
                                    return false;
                                else
                                    colchetes.pop();
                            } else {
                                if (x[i] == '}') {
                                    if (chaves.isEmpty())
                                        return false;
                                    else
                                        chaves.pop();
                                }
                            }
                        }
                    }
                }
            }
        }

        return parenteses.isEmpty() && colchetes.isEmpty() && chaves.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "{[2 * (2 + 5)] / 2}";
        System.out.println("A expressão: " + expr + " - é valida? " + ParenMatch
                        .parenMatch(expr.toCharArray(), expr.length()));

        expr = "{[2 * (2 + 5) / 2}";
        System.out.println("A expressão: " + expr + " - é valida? " + ParenMatch
                        .parenMatch(expr.toCharArray(), expr.length()));
    }

}
