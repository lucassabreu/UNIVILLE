package reservas;

public class Aeronave {
    private int    numeracao;
    private String modelo;
    private int    limitePassageiros;

    public Aeronave() {}

    public Aeronave(int numeracao, String modelo, int limitePassageiros) {
        this();

        this.numeracao = numeracao;
        this.modelo = modelo;
        this.limitePassageiros = limitePassageiros;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setLimitePassageiros(int limitePassageiros) {
        this.limitePassageiros = limitePassageiros;
    }

    public int getLimitePassageiros() {
        return limitePassageiros;
    }
}
