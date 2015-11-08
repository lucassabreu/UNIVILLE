package exerc4.reservas;

import java.util.ArrayList;
import exerc4.clientes.Passagem;

public class Voo {
	private Piloto capitao;
	private Piloto copiloto;
	private Aeronave aeronave;
	private ArrayList<Passagem> reservas
		= new ArrayList<Passagem>();
	private int numero;
	private String origem;
	private String destino;
	
	public Voo(int numero, String origem) {
		this.numero = numero;
		this.origem = origem;
	}
	public void checkin(Passagem novaPassagem){
		if(aeronave.getLimitePassageiros() >= 
				reservas.size()){
			for(int i=0;i<reservas.size();i++){
				Passagem reservEfetiv = 
						reservas.get(i);
				//aqui1
				if(reservEfetiv.getAssento() ==
						novaPassagem.getAssento()){
					System.out.println("ERRO: ja vendeu assento");
					return;
				}
			}
			reservas.add(novaPassagem);
		}
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
	public Aeronave getAeronave() {
		return aeronave;
	}
	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}
	public ArrayList<Passagem> getReservas() {
		return reservas;
	}
	public void setReservas(ArrayList<Passagem> reservas) {
		this.reservas = reservas;
	}
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
	
	
	
}
