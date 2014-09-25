package br.univille.b2.aula6;

import br.univille.b2.aula5.pilha.ArrayStack;

public class NotacaoPosFixada {

    public static String posFixada(String expr) {
        return NotacaoPosFixada.posFixada(expr.toCharArray());
    }

    public static void desempilhar(ArrayStack<Character> operadores, ArrayStack<String> numeros, StringBuffer exprPosFixada, boolean numerosPrimeiro) {
        if (operadores.isEmpty() || operadores.top().equals('(')) {
            String strNum = numeros.pop();
            operadores.pop();
            numeros.pop();
            numeros.push(strNum);
            return;
        }

        StringBuffer sbNumeros = new StringBuffer();
        StringBuffer sbOperadores = new StringBuffer();

        while (!operadores.isEmpty() && !operadores.top().equals('(')) {

            if (!numeros.isEmpty() && !numeros.top().equals("(")) {
                sbNumeros.append(numeros.pop());
                sbNumeros.append(' ');
            }

            sbOperadores.insert(0, ' ');
            sbOperadores.insert(0, operadores.pop());
        }

        while (!numeros.isEmpty() && !numeros.top().equals("(")) {
            sbNumeros.append(numeros.pop());
            sbNumeros.append(' ');
        }

        if (!operadores.isEmpty() && operadores.top().equals('('))
            operadores.pop();

        if (!numeros.isEmpty() && numeros.top().equals("("))
            numeros.pop();

        if (numerosPrimeiro)
            exprPosFixada.insert(0, sbNumeros);
        else
            exprPosFixada.append(sbNumeros);

        exprPosFixada.append(sbOperadores);
    }

    public static float resolver(String expr) {
        return resolver(expr.toCharArray());
    }

    public static float resolver(char[] expr) {
        float result = 0;

        float num = 0f;
        ArrayStack<Float> numeros = new ArrayStack<>();

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
                    if (!numeros.isEmpty() && numeros.top() != null) {
                        num = numeros.top();
                    } else
                        num = 0;

                    if (!numeros.isEmpty())
                        numeros.pop();

                    num = num * 10 + Float.parseFloat(String
                                    .format("%c", expr[i]));

                    numeros.push(num);
                    break;
                default:
                    if (numeros.top() == null)
                        numeros.pop();

                    result = NotacaoPosFixada.calcula(expr[i], //
                                    numeros.pop(), //
                                    numeros.pop());
                    numeros.push(result);
                    numeros.push(null);

                    break;
            }

            // System.out.printf("%c : %s \n", expr[i], numeros);
        }

        return result;
    }

    protected static float calcula(char operador, float num1, float num2) {
        switch (operador) {
            case '^':
                return (float) Math.pow(num1, num2);
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
        }

        return 0;
    }

    public static String posFixada(char[] expr) {

        String strNum = "";
        StringBuffer exprPosFixada = new StringBuffer();
        int precede = 0;

        ArrayStack<String> numeros = new ArrayStack<>();
        ArrayStack<Character> operadores = new ArrayStack<>();

        for (int i = 0; i < expr.length; i++) {
            switch (expr[i]) {
                case ' ':
                    if (!numeros.isEmpty() && !numeros.top().equals(""))
                        numeros.push("");
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
                    if (numeros.isEmpty())
                        strNum = String.format("%c", expr[i]);
                    else
                        strNum = String.format("%s%c", numeros.pop(), expr[i]);

                    numeros.push(strNum);
                    break;
                case '(':
                case '[':
                case '{':
                    operadores.push('(');

                    if (!numeros.isEmpty() && numeros.top().equals(""))
                        numeros.pop();

                    numeros.push("(");
                    numeros.push("");
                    break;
                case ')':
                case ']':
                case '}':
                    NotacaoPosFixada.desempilhar(operadores, numeros, exprPosFixada, false);
                    break;
                case '^':
                    if (!operadores.isEmpty() //
                                    && (operadores.top().equals('+') //
                                                    || operadores.top()
                                                                    .equals('-') //
                                                    || operadores.top()
                                                                    .equals('*') //
                                    || operadores.top().equals('/'))) {
                        if (numeros.top().equals(""))
                            numeros.pop();
                        strNum = numeros.pop();
                        numeros.push("(");
                        operadores.push('(');
                        numeros.push(strNum);
                        precede++;
                    }
                    operadores.push(expr[i]);

                    if (!numeros.isEmpty() && !numeros.top().equals(""))
                        numeros.push("");
                    break;
                case '*':
                case '/':

                    if (!operadores.isEmpty()) {
                        if (precede > 0 && operadores.top().equals('^')) {
                            NotacaoPosFixada.desempilhar(operadores, numeros, exprPosFixada, true);
                            precede--;
                        }

                        if (!operadores.isEmpty() //
                                        && (operadores.top().equals('+') //
                                        || operadores.top().equals('-'))) {
                            if (numeros.top().equals(""))
                                numeros.pop();
                            strNum = numeros.pop();
                            numeros.push("(");
                            operadores.push('(');
                            numeros.push(strNum);
                            precede++;
                        }
                    }

                    operadores.push(expr[i]);

                    if (!numeros.isEmpty() && !numeros.top().equals(""))
                        numeros.push("");
                    break;
                case '+':
                case '-':

                    if (precede > 0 && !operadores.isEmpty() //
                                    && (operadores.top().equals('^') //
                                                    || operadores.top()
                                                                    .equals('/') //
                                    || operadores.top().equals('*'))) {
                        NotacaoPosFixada.desempilhar(operadores, numeros, exprPosFixada, true);
                        precede--;
                    }

                    operadores.push(expr[i]);

                    if (!numeros.isEmpty() && !numeros.top().equals(""))
                        numeros.push("");
                    break;
            }

            if (expr[i] != ' ')
                System.out.printf("Caracter: %c ; Numeros: %20s ; Operadores : %22s ; expressão : %20s ; precede : %d \n", expr[i], numeros, operadores, exprPosFixada, precede);
        }

        while (precede > 0) {
            NotacaoPosFixada.desempilhar(operadores, numeros, exprPosFixada, true);
            precede--;
        }

        NotacaoPosFixada.desempilhar(operadores, numeros, exprPosFixada, false);

        return exprPosFixada.toString().trim();
    }

    public static void main(String[] args) {
        String expr = "", result = "";

        expr = "2 + (2 * 3 + 5 - 4) * 2";
        result = NotacaoPosFixada.posFixada(expr);

        System.out.printf("Resultado (%s): %s = ", expr, result);
        System.out.printf("%f\n", NotacaoPosFixada.resolver(result));

        // expr = "2 * 3 / 4";
        // System.out.printf("Resultado (%s): %s\n", expr, //
        // NotacaoPosFixada.posFixada(expr));
        //
        // expr = "((2 + 3) * (7 - 5)) / 2";
        // System.out.printf("Resultado (%s): %s\n", expr, //
        // NotacaoPosFixada.posFixada(expr));
    }
}
