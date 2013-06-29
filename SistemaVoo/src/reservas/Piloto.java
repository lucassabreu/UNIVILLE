package reservas;

public class Piloto {
    private String breve;
    private String nome;

    public Piloto() {}

    public Piloto(String breve, String nome) {
        this();

        this.breve = breve;
        this.nome = nome;
    }

    public String getBreve() {
        return breve;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
