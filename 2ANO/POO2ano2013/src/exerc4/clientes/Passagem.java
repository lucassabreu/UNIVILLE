package exerc4.clientes;

public class Passagem {
	private Passageiro comprador;
	private int assento;
	
	
	
	public Passagem(int assento) {
		this.assento = assento;
	}

	public Passageiro getComprador() {
		return comprador;
	}

	public void setComprador(Passageiro comprador) {
		this.comprador = comprador;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}
	
}
