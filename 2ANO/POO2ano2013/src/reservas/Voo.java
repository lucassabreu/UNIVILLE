package reservas;

import java.util.ArrayList;
import clientes.Passagem;

public class Voo {
	private int numero;
	private String origem;
	private String destino;
	private Aeronave aeronave;
	private Piloto capitao;
	private Piloto copiloto;
	private ArrayList<Passagem> reservas
		= new ArrayList<Passagem>();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Aeronave getAeronave() {
		return aeronave;
	}
	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}
	public Piloto getCapitao() {
		return capitao;
	}
	public void setCapitao(Piloto capitao) {
		this.capitao = capitao;
	}
	public Piloto getCopiloto() {
		return copiloto;
	}
	public void setCopiloto(Piloto copiloto) {
		this.copiloto = copiloto;
	}
	public ArrayList<Passagem> getReservas() {
		return reservas;
	}
	public void setReservas(ArrayList<Passagem> reservas) {
		this.reservas = reservas;
	}
}
