package controlefinanceiro.dao;

import java.sql.Date;

public class Despesa {
    private int            oid;
    private String         descricao;
    private float          valor;
    private Date           data;
    private DespesaReceita tipo;
    private boolean        pago;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public DespesaReceita getTipo() {
        return tipo;
    }

    public void setTipo(DespesaReceita tipo) {
        this.tipo = tipo;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

}
