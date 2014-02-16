package zoologico;

public class Aguia extends Ave{

	public Aguia(String nome, double peso) {
		super(nome, peso);
	}
	//polimorfismo
	//sobrecarga
	public boolean voa(float distancia){
		return super.voa();
	}
	public boolean voa(){
		return false;
	}

}
