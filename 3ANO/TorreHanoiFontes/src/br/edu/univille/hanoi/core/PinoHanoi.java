package br.edu.univille.hanoi.core;

import br.edu.univille.hanoi.core.exception.PinoCheioException;
import br.edu.univille.hanoi.core.exception.PinoVazioException;

public interface PinoHanoi {

	// Método que retorna a quantidade de discos no pino
	public int size();

	// Metodoque indica se o pino está vazia
	public boolean isEmpty();

	// Metodo que retorna o disco no topo do pino sem retirá-lo
	public Disco top() throws PinoVazioException;

	// Método que adiciona um disco ao topo da pino
	public void push(Disco disco) throws PinoCheioException;

	// Método que retira um disco do topo da pino.
	public Disco pop() throws PinoVazioException;

	// Método que imprime uma representação do estado dos discos
	public void imprime(char[][] c, int pino);
	
	// Método que inicializa o pino com a capacidade de discos suportada
	public void init(int tamanho);

}
