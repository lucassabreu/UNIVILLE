package br.univille.goldengift;

public class ItemNotaFiscal {
    private ProdutoFornecido produto;
    private float            quantidade;
    private float            valor;

    public ProdutoFornecido getProduto() {
        return produto;
    }

    public void setProduto(ProdutoFornecido produto) {
        this.produto = produto;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
