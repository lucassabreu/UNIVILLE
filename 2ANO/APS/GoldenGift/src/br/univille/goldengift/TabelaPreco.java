package br.univille.goldengift;

import java.util.Date;

public class TabelaPreco {
    private ProdutoFornecido produto;
    private Date             dataInicio;
    private Date             dataFim;
    private float            precoUnitario;

    public ProdutoFornecido getProduto() {
        return produto;
    }

    public void setProduto(ProdutoFornecido produto) {
        this.produto = produto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

}
