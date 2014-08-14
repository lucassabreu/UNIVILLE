package exer.b3.n2.pilha;

public class FullStackException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FullStackException(String err) {
        super(err);
    }
}
