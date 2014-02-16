package br.univille.goldengift;

import java.util.ArrayList;

public class Fornecedor {

    private String                      cnpj;
    private String                      razaoSocial;
    private String                      endereco;
    private String                      fone;
    private String                      email;
    private ArrayList<ProdutoFornecido> produtos;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public ArrayList<ProdutoFornecido> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ProdutoFornecido> produtos) {
        this.produtos = produtos;
    }

}
