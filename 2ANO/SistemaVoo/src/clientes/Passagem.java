package clientes;

public class Passagem {
    private int        assento;
    private Passageiro comprador;

    public Passagem(int assento) {
        this.assento = assento;
    }

    public Passagem(int assento, Passageiro comprador) {
        this(assento);
        this.comprador = comprador;
    }

    public int getAssento() {
        return assento;
    }

    public Passageiro getComprador() {
        return comprador;
    }

    public void setComprador(Passageiro comprador) {
        this.comprador = comprador;
    }
}
