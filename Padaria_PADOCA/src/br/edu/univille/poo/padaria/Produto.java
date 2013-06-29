package br.edu.univille.poo.padaria;

public class Produto {
    private int    codigo = 0;
    private String nome   = null;
    private float  valor  = 0f;

    public Produto() {}

    public Produto(int codigo, String nome, float valor) {
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
