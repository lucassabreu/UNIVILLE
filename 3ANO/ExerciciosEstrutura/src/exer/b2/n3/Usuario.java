package exer.b2.n3;

import java.util.Date;

public class Usuario {
    private int    codigo;
    private String nome;
    private String sobrenome;
    private Date   nascimento;

    public Usuario() {}

    public Usuario(int codigo, String nome, String sobrenome, Date nascimento) {
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return String.format("{%d, \"%s\", \"%s\", \"%s\"}", this.codigo, this.nome, this.sobrenome, this.nascimento);
    }
}
