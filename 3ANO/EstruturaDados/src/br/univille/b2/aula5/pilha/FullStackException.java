package br.univille.b2.aula5.pilha;

public class FullStackException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FullStackException(String err) {
        super(err);
    }
}
