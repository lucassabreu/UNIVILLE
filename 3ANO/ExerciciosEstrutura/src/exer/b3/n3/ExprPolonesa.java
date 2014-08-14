package exer.b3.n3;

import exer.b3.n3.pilha.ArrayStack;

public class ExprPolonesa {
    public static float calcular(String expr) {
        return calcular(expr.split(" "));
    }

    public static boolean isOperando(String value) {
        switch (value) {
            case "-":
            case "+":
            case "*":
            case "/":
                return false;
            default:
                return true;
        }
    }

    public static float calcularOperacao(float num1, float num2, String op) {
        if (op.equals("-"))
            return num2 - num1;

        if (op.equals("+"))
            return num2 + num1;

        if (op.equals("/"))
            return num2 / num1;

        if (op.equals("*"))
            return num2 * num1;

        return 0;
    }

    public static float calcular(String[] conjunto) {
        ArrayStack<Float> numeros = new ArrayStack<Float>(conjunto.length);

        for (String value : conjunto) {
            if (isOperando(value)) {
                numeros.push(Float.parseFloat(value));
            } else {
                numeros.push(calcularOperacao(numeros.pop(), numeros.pop(), value));
            }
        }

        return numeros.pop();
    }

    public static void main(String[] args) {

        String expr = "3 2 + 4 *";
        System.out.printf("Expr: %20s = %5.2f \n", expr, calcular(expr));

        expr = "3 2 4 + /";
        System.out.printf("Expr: %20s = %5.2f \n", expr, calcular(expr));

        expr = "3 2 + 4 -";
        System.out.printf("Expr: %20s = %5.2f \n", expr, calcular(expr));

        expr = "3 2 4 - +";
        System.out.printf("Expr: %20s = %5.2f \n", expr, calcular(expr));

        expr = "3 2 4 / +";
        System.out.printf("Expr: %20s = %5.2f \n", expr, calcular(expr));
    }
}
