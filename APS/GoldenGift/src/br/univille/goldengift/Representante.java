package br.univille.goldengift;

public class Representante {
    private String cpnf;
    private String nome;
    private String enderenco;
    private String fone;
    private String email;
    private String foto;
    private Regiao regiao;

    public String getCpnf() {
        return cpnf;
    }

    public void setCpnf(String cpnf) {
        this.cpnf = cpnf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderenco() {
        return enderenco;
    }

    public void setEnderenco(String enderenco) {
        this.enderenco = enderenco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

}
