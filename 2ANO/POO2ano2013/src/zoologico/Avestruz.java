package zoologico;

public class Avestruz extends Ave{

	public Avestruz(String nome, double peso) {
		super(nome, peso);
	}
	//SOBREESCRITA DE METODO
	public boolean voa(){
		return false;
	}
}
