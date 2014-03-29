package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        for (int i = 0; i < 40; i++) {
            System.out.println(String.format("%2d : %6d - %6d", //
                            i, //
                            Fibonacci.fibonacciRecursico(i), //
                            Fibonacci.fibonacciNaoRecursico(i)));
        }

    }

    public static int fibonacciNaoRecursico(int i) {
        if (i == 0)
            return 0;
        else {
            if (i == 1)
                return 1;
            else {
                int ant = 0, atual = 0, antAux = 0;

                ant = 0;
                atual = 1;

                for (int j = 2; j < i; j++) {
                    antAux = atual;
                    atual = atual + ant;
                    ant = antAux;
                }

                return atual + ant;
            }
        }
    }

    public static int fibonacciRecursico(int i) {
        if (i == 0)
            return 0;
        else {
            if (i == 1)
                return 1;
            else
                return fibonacciRecursico(i - 1) + fibonacciRecursico(i - 2);
        }
    }

}
