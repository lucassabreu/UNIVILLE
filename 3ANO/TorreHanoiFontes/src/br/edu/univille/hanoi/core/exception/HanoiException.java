package br.edu.univille.hanoi.core.exception;

public class HanoiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7798312323945174728L;

	public HanoiException(String mensagem, Throwable origem) {
		super(mensagem, origem);
	}

	public HanoiException(String mensagem) {
		super(mensagem);
	}

}
