package exerc4.clientes;

public class Bagagem {
	private Passageiro meuPassageiro;
	private String tipo;
	private float peso;
	
	public Bagagem(String tipo, float peso) {
		this.tipo = tipo;
		this.peso = peso;
	}

	public Passageiro getMeuPassageiro() {
		return meuPassageiro;
	}

	public void setMeuPassageiro(Passageiro meuPassageiro) {
		this.meuPassageiro = meuPassageiro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
