package dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
        @NamedQuery(name = "getAllClientes", query = "SELECT c FROM Cliente c"),
        @NamedQuery(name = "getClienteByEnd", query = "SELECT c FROM Cliente c WHERE c.endereco LIKE :ender"), })
@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = -7244586951401888766L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int     oid;
    @Column(unique = true, nullable = false)
    private String  codigo;
    private String  nome;
    @Column(length = 5000)
    private String  endereco;
    private boolean sexo;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}
