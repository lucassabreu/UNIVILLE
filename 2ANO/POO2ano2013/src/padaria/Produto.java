package padaria;

import java.util.ArrayList;

public class Produto {
	private int codigo;
	private String descricao;
	private float valor;
	
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public int getCodigo(){
		return codigo;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao(){
		return descricao;
	}
	public void setValor(float valor){
		this.valor = valor;
	}
	public float getValor(){
		return valor;
	}
}
