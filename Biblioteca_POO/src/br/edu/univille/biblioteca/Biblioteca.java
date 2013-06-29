package br.edu.univille.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String           nome;

    private List<Livro>      livros      = new ArrayList<Livro>();
    private List<DVD>        dvds        = new ArrayList<DVD>();
    private List<Periodico>  periodicos  = new ArrayList<Periodico>();
    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    private List<Aluno>      alunos      = new ArrayList<Aluno>();

    public Biblioteca() {}

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<DVD> getDvds() {
        return dvds;
    }

    public List<Periodico> getPeriodicos() {
        return periodicos;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}
