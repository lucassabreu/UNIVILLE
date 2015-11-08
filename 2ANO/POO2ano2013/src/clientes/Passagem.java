package clientes;

public class Passagem {
	private int assento;
	private Passageiro comprador;
	
	public Passagem(int assento) {
		this.assento = assento;
	}

	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public Passageiro getComprador() {
		return comprador;
	}

	public void setComprador(Passageiro comprador) {
		this.comprador = comprador;
	}
	
}
