package clientes;

import java.util.ArrayList;

public class Passageiro {
	private String nome;
	private String CPF;
	private String RG;
	private String dataNascimento;
	private ArrayList<Bagagem> colBagagens
		= new ArrayList<Bagagem>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public ArrayList<Bagagem> getColBagagens() {
		return colBagagens;
	}
	public void setColBagagens(ArrayList<Bagagem> colBagagens) {
		this.colBagagens = colBagagens;
	}
	
}
