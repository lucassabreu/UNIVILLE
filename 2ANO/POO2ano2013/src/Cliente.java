
public class Cliente {
	//Variaveis - ATRIBUTO
	String nome;
	int codigo;
	boolean sexo;
	
	//Fun��es - METODO
	//CONSTRUTOR
	public Cliente(String nome, int codigo){
		this.nome = nome;
		this.codigo = codigo;
	}

	public String toString(){
		return nome + " codigo: " + codigo;
	}
	
}
