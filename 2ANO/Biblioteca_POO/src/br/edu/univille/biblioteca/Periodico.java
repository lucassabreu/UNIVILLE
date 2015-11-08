package br.edu.univille.biblioteca;

public class Periodico {

    private Biblioteca biblioteca;
    private int        codigo;
    private String     descricao;
    private String     edicao;
    private int        ano;

    public Periodico(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    

    public Periodico(Biblioteca biblioteca, int codigo, String descricao,
                    String edicao, int ano) {
        this(biblioteca);
        this.codigo = codigo;
        this.descricao = descricao;
        this.edicao = edicao;
        this.ano = ano;
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

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
