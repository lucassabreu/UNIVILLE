package controlefinanceiro.dao;

public class DespesaReceita {
	private int codigo;
	private String descricao;
	private TipoDespesaReceita tipo;
	
	public DespesaReceita(){
	
	}
	
	public DespesaReceita(int codigo, String descricao ,
			TipoDespesaReceita tipo) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.tipo = tipo;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoDespesaReceita getTipo() {
		return tipo;
	}
	public void setTipo(TipoDespesaReceita tipo) {
		this.tipo = tipo;
	}
}
