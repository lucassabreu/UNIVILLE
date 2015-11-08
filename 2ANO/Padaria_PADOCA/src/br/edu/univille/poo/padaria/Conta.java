package br.edu.univille.poo.padaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private int                fatura         = 0;
    private Caixa              caixa          = null;
    private Date               dataEmissao    = null;
    private String             formaPagamento = null;
    private List<ProdutoConta> itens          = new ArrayList<ProdutoConta>();

    public Conta(Caixa caixa, Date dataEmissao) {
        super();
        this.fatura = this.getCaixa().getAtendente().getPadaria()
                        .getNextFatura();
    }

    public Conta(Caixa caixa, Date dataEmissao, String formaPagamento) {
        this(caixa, dataEmissao);
        this.caixa = caixa;
        this.dataEmissao = dataEmissao;
        this.formaPagamento = formaPagamento;
    }

    public int getFatura() {
        return fatura;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ProdutoConta[] getItens() {
        return (ProdutoConta[]) itens.toArray();
    }

    public Conta addProduto(Produto produto, float valorUnitario, int quantidade) {

        this.itens.add(new ProdutoConta(this, produto, valorUnitario, quantidade));

        return this;
    }

    public ProdutoConta getProduto(int i) {
        return this.itens.get(i);
    }

    public ProdutoConta removeProduto(int i) {
        return this.itens.remove(i);
    }
    
    public int sizeProdutos() {
        return this.itens.size();
    }
}
