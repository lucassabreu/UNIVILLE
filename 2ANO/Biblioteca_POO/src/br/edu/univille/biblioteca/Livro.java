package br.edu.univille.biblioteca;

public class Livro {

    private Biblioteca biblioteca;

    private String     titulo;
    private String     autor;
    private int        isbn;
    private int        ano;

    public Livro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Livro(Biblioteca biblioteca, String titulo, String autor, int isbn,
                    int ano) {
        this(biblioteca);
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int ibsn) {
        this.isbn = ibsn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
