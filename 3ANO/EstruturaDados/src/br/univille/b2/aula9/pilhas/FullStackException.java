package br.univille.b2.aula9.pilhas;

public class FullStackException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FullStackException(String err) {
        super(err);
    }
}
