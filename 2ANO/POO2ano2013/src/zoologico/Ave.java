package zoologico;

public class Ave extends Animal{
	//CONSTRUTOR
	//tem o mesmo nome da classe
	//nao tem retorno
	public Ave(String nome,
			double peso) {
		super(nome,peso);
	}
	public boolean voa(){
		return true;
	}
	
}
