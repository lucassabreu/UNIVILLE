package padaria;

import java.util.Date;

public class Atendente {
	private int codigo;
	private String nome;
	private String telefone;
	private Date dataNascimento;
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public int getCodigo(){
		return codigo;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public String getTelefone(){
		return telefone;
	}
	public void setDataNascimento(Date dataNascimento){
		this.dataNascimento = dataNascimento;
	}
	public Date getDataNascimento(){
		return dataNascimento;
	}
}
