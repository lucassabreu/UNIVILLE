
public class Motor {
	private String modelo;
	private int numPontosIn;
	private int numCavalos;
	
	//Getters - Setters
	
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		if(this.modelo == null){
			this.modelo = modelo;
		}else{
			System.out.println("Nao e possivel alterar...");
		}
	}
	
	
	//POLIMORFISMO - SOBRECARGA DE METODOS
	public Motor() {
		this.numCavalos=100;
	}
	//VARARGS
	public Motor(int...parametros){
		this.numCavalos = parametros[0];
		this.numPontosIn = parametros[1];
	}
	
	//Metodo Construtor
	public Motor(int numCavalos){
		this.numCavalos = numCavalos;
	}
	
	public String toString(){
		return "Mod: " + modelo + 
				" NumCav " + numCavalos;
	}
	
}
