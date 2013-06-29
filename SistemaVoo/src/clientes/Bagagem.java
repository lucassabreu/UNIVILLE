package clientes;

public class Bagagem {
    private String     tipo;
    private float      peso;

    private Passageiro passageiro;

    /**
     * 
     * @param tipo
     * @param peso
     */
    public Bagagem(String tipo, float peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    /**
     * 
     * @param passageiro
     * @param tipo
     * @param peso
     */
    public Bagagem(Passageiro passageiro, String tipo, float peso) {
        this(tipo, peso);
        this.passageiro = passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
