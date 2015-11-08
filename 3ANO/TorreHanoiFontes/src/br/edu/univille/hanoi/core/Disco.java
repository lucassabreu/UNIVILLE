package br.edu.univille.hanoi.core;

public class Disco {
	
	private int tamanho;

	public Disco(int tamanho){
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return String.valueOf(this.tamanho);
	}
	
	public boolean maiorQue(Disco d){
		return this.tamanho > d.tamanho;
	}
	
	public boolean menorQue(Disco d){
		return this.tamanho < d.tamanho;
	}

	public int tamanho() {
		return tamanho;
	}
	
}
