package br.univille.b2.aula9.pilhas;

public class EmptyStackException extends RuntimeException {
    private static final long serialVersionUID = 5676755395834842375L;

    public EmptyStackException(String mes) {
        super(mes);
    }
}
