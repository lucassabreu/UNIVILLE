package clientes;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    
    private List<Bagagem> colBagagens = new ArrayList<Bagagem>();

    public Passageiro() {}

    public Passageiro(String nome, String cpf, String rg, String dataNascimento) {
        this();

        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    
    public List<Bagagem> getColBagagens() {
        return colBagagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
