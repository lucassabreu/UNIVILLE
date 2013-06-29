package br.edu.univille.poo.padaria;

import java.util.Date;

public class Caixa {
    private Atendente atendente    = null;
    private float     valorInicial = 0;
    private float     valorFinal   = 0;
    private Date      data         = null;

    public Caixa(Atendente atendente) {
        super();
        this.atendente = atendente;
        this.valorInicial = 0;
        this.valorFinal = 0;
        this.data = new Date();
    }
    
    public Caixa(Atendente atendente, Date data, float valorInicial, float valorFinal) {
        this(atendente);this.data = data;
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public float getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(float valorInicial) {
        this.valorInicial = valorInicial;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
