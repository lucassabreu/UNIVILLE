package br.edu.univille.poo.padaria;

import java.util.Date;

/**
 * Representa um Atendente
 * 
 * @author Lucas dos Santos Abreu <lucas.s.abreu@gmail.com>
 */
public class Atendente {
    private Padaria padaria        = null;
    private int     codigo         = 0;
    private String  nome           = null;
    private String  endereco       = null;
    private Date    dataNascimento = null;

    /**
     * Constroi um objeto Atendente sem dados
     */
    public Atendente() {
        super();
    }

    /**
     * Constroi um objeto Atendente preenchido
     * 
     * @param padaria
     *            Padaria na qual o Atendente trabalha
     * @param codigo
     *            Código Ãºnico do Atendente
     * @param nome
     *            Nome do atendente
     * @param endereco
     *            Endereco completo do Atendente
     */
    public Atendente(Padaria padaria, int codigo, String nome, String endereco, Date dataNascimento) {
        this();
        this.padaria = padaria;
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public Padaria getPadaria() {
        return padaria;
    }

    public void setPadaria(Padaria padaria) {
        this.padaria = padaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
