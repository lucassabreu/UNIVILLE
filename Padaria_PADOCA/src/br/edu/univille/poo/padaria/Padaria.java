package br.edu.univille.poo.padaria;

import java.util.ArrayList;
import java.util.List;

public class Padaria {
    private String          razaoSocial  = null;
    private String          cnpj         = null;
    private int             ultimaFatura = 0;

    private List<Atendente> atendentes   = new ArrayList<Atendente>();
    private List<Produto>   produtos     = new ArrayList<Produto>();

    public Padaria(String razaoSocial, String cnpj, int ultimaFatura) {
        super();
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.ultimaFatura = ultimaFatura;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getUltimaFatura() {
        return ultimaFatura;
    }

    public int getNextFatura() {
        return ++this.ultimaFatura;
    }

    public List<Atendente> getAtendentes() {
        return atendentes;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
