package br.edu.univille.biblioteca;

import java.util.Date;

public class ItemEmprestimo {
    private Emprestimo emprestimo;

    private DVD        dvd;
    private Periodico  periodico;
    private Livro      livro;

    private Date       dataDevolucao;

    protected ItemEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
        this.dataDevolucao = null;
        this.dvd = null;
        this.periodico = null;
        this.livro = null;
    }

    public ItemEmprestimo(Emprestimo emprestimo, DVD dvd) {
        this(emprestimo);
        this.dvd = dvd;
    }

    public ItemEmprestimo(Emprestimo emprestimo, Periodico periodico) {
        this(emprestimo);
        this.periodico = periodico;
    }

    public ItemEmprestimo(Emprestimo emprestimo, Livro livro) {
        this(emprestimo);
        this.livro = livro;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public DVD getDvd() {
        return dvd;
    }

    public Periodico getPeriodico() {
        return periodico;
    }

    public Livro getLivro() {
        return livro;
    }
}
