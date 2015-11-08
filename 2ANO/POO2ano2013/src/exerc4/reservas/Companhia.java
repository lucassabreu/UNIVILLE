package exerc4.reservas;

import java.util.ArrayList;

public class Companhia {
	private ArrayList<Piloto> funcionarios =
			new ArrayList<Piloto>();
	private ArrayList<Voo> linhas = 
			new ArrayList<Voo>();
	private ArrayList<Aeronave> frota = 
			new ArrayList<Aeronave>();

	
	public ArrayList<Piloto> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(ArrayList<Piloto> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public ArrayList<Voo> getLinhas() {
		return linhas;
	}
	public void setLinhas(ArrayList<Voo> linhas) {
		this.linhas = linhas;
	}
	public ArrayList<Aeronave> getFrota() {
		return frota;
	}
	public void setFrota(ArrayList<Aeronave> frota) {
		this.frota = frota;
	}
	
	
	
}
