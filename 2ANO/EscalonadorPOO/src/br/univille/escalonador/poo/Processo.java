package br.univille.escalonador.poo;

public class Processo {
    public String nome;
    public int    tempoChegada;
    public int    tempoExecucao;

    public Processo(String nome, int tempoChegada, int tempoExec) {
        this.nome = nome;
        this.tempoChegada = tempoChegada;
        this.tempoExecucao = tempoExec;
    }
}
