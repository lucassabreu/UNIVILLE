package br.edu.univille.biblioteca;

public class DVD {
    private Biblioteca biblioteca;

    private int        codigo;
    private String     descricao;
    private int        ano;
    private int        duracao;

    public DVD(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    

    public DVD(Biblioteca biblioteca, int codigo, String descricao, int ano,
                    int duracao) {
        this(biblioteca);
        this.codigo = codigo;
        this.descricao = descricao;
        this.ano = ano;
        this.duracao = duracao;
    }



    public Biblioteca getBiblioteca() {
        return biblioteca;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

}
