package escalonador;

public class Processo {
	//ATRIBUTO - escopo de classe
	public String nome;
	public int tempoChegada;
	public int tempoExec;
	
	//METODO CONSTRUTOR
	// SEMPRE TEM O NOME DA CLASSE
	// ELE NAO PODE RETORNAR NADA!!!
	public Processo(String nome, int tempoChegada,
				int tempoExec){
		this.nome = nome;
		this.tempoChegada = tempoChegada;
		this.tempoExec = tempoExec;
	}
	
	
	
}
