package padaria;

public class ItemConta {
	private int quantidade;
	private Produto meuProduto;
	
	public void setQuantidade(int qtd){
		this.quantidade = qtd;
	}
	public int getQuantidade(){
		return quantidade;
	}
	public void setProduto(Produto prod){
		this.meuProduto = prod;
	}
	public Produto getProduto(){
		return meuProduto;
	}
}
