package br.edu.univille.hanoi.core.exception;

public class PinoVazioException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7798312323945174728L;

	public PinoVazioException() {
		super("A pilha esta cheia!");
	}

}
