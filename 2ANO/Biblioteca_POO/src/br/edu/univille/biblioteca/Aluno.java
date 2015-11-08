package br.edu.univille.biblioteca;

public class Aluno {
    private Biblioteca biblioteca;

    private String     nome;
    private int        codigo;
    
    public Aluno(Biblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public Aluno(Biblioteca biblioteca, String nome, int codigo) {
        this(biblioteca);
        this.nome = nome;
        this.codigo = codigo;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
