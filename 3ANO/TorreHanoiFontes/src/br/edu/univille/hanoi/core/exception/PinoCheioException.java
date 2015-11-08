package br.edu.univille.hanoi.core.exception;

public class PinoCheioException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7798312323945174728L;

	public PinoCheioException() {
		super("A pilha esta cheia!");
	}

}
