package br.edu.univille.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
    private Biblioteca                biblioteca;
    private Aluno                     aluno;

    private Date                      dataEmprestimo;
    private Date                      dataDevolucao;

    private ArrayList<ItemEmprestimo> itens = new ArrayList<ItemEmprestimo>();

    public Emprestimo(Biblioteca biblioteca, Aluno aluno) {
        this.biblioteca = biblioteca;
        this.aluno = aluno;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void addItem(DVD dvd) {
        this.getItens().add(new ItemEmprestimo(this, dvd));
    }

    public void addItem(Periodico periodico) {
        this.getItens().add(new ItemEmprestimo(this, periodico));
    }

    public void addItem(Livro livro) {
        this.getItens().add(new ItemEmprestimo(this, livro));
    }

    public ArrayList<ItemEmprestimo> getItens() {
        return itens;
    }

}
