package br.edu.univille.poo.padaria;

public class ProdutoConta {
    private Conta   conta         = null;
    private Produto produto       = null;
    private float   valorUnitario = 0;
    private int     quantidade    = 0;

    public ProdutoConta(Conta conta) {
        super();
        this.conta = conta;
    }

    public ProdutoConta(Conta conta, Produto produto, float valorUnitario, int quantidade) {
        this(conta);
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public Conta getConta() {
        return conta;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
