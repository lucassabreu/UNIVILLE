package exer.b3.n3.pilha;

public class EmptyStackException extends RuntimeException {
    private static final long serialVersionUID = 5676755395834842375L;

    public EmptyStackException(String mes) {
        super(mes);
    }
}
