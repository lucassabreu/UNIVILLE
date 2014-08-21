package br.edu.univille.hanoi.core;

import br.edu.univille.hanoi.core.exception.PinoCheioException;
import br.edu.univille.hanoi.core.exception.PinoVazioException;

public interface PinoHanoi {

	// M�todo que retorna a quantidade de discos no pino
	public int size();

	// Metodoque indica se o pino est� vazia
	public boolean isEmpty();

	// Metodo que retorna o disco no topo do pino sem retir�-lo
	public Disco top() throws PinoVazioException;

	// M�todo que adiciona um disco ao topo da pino
	public void push(Disco disco) throws PinoCheioException;

	// M�todo que retira um disco do topo da pino.
	public Disco pop() throws PinoVazioException;

	// M�todo que imprime uma representa��o do estado dos discos
	public void imprime(char[][] c, int pino);
	
	// M�todo que inicializa o pino com a capacidade de discos suportada
	public void init(int tamanho);

}
