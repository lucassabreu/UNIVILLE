package exer.b3.n2;

import exer.b3.n2.pilha.ArrayStack;

public class ParenMatch {

    public static boolean parenMatch(String x) {
        return parenMatch(x.toCharArray());
    }

    public static boolean parenMatch(char[] x) {

        char c;
        ArrayStack<Character> parens = new ArrayStack<Character>(x.length);

        for (int i = 0; i < x.length; i++) {

            if (x[i] == '(' || x[i] == '[' || x[i] == '{') {
                parens.push(x[i]);
            } else {
                if (x[i] == ')' || x[i] == ']' || x[i] == '}') {
                    if (parens.isEmpty())
                        return false;

                    c = parens.pop();

                    if (x[i] == ')' && c != '(')
                        return false;

                    if (x[i] == ']' && c != '[')
                        return false;

                    if (x[i] == '}' && c != '{')
                        return false;
                }
            }
        }

        return parens.isEmpty();
    }

    public static void main(String[] args) {

        String x = "(1 + 3) * (5 + 4) + 2";

        System.out.printf("Equação: %30s --> %s\n", x, parenMatch(x) ? "Correto" : "Errado");

        x = "(1 + [3) * (5] + 4) + 2";
        System.out.printf("Equação: %30s --> %s\n", x, parenMatch(x) ? "Correto" : "Errado");

        x = "[1 + (3) * [(5)] + 4) + 2";
        System.out.printf("Equação: %30s --> %s\n", x, parenMatch(x) ? "Correto" : "Errado");

        x = "1 + (3) * [(5)] + 4 + 2";
        System.out.printf("Equação: %30s --> %s\n", x, parenMatch(x) ? "Correto" : "Errado");

        x = "{0} [1 + (3) * [(5)] + 4 + 2]";
        System.out.printf("Equação: %30s --> %s\n", x, parenMatch(x) ? "Correto" : "Errado");

        x = "[0[ [1 + [3[ * [(5)] + 4 + 2]";
        System.out.printf("Equação: %30s --> %s\n", x, parenMatch(x) ? "Correto" : "Errado");
    }
}
