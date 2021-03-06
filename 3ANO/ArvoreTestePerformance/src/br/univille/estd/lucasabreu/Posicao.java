package br.univille.estd.lucasabreu;

public class Posicao {
    private Posicao esquerda;
    private Posicao direita;
    private Posicao topo;
    private int     valor = 0;

    private int     maiorDistancia;
    private int     balanco;

    public int getValor() {
        return valor;
    }

    public int getMaiorDistancia() {
        return maiorDistancia;
    }

    public void setMaiorDistancia(int maiorDistancia) {
        this.maiorDistancia = maiorDistancia;
    }

    public int getBalanco() {
        return balanco;
    }

    public void setBalanco(int balanco) {
        this.balanco = balanco;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Posicao getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Posicao esquerda) {
        this.esquerda = esquerda;
    }

    public Posicao getDireita() {
        return direita;
    }

    public void setDireita(Posicao direita) {
        this.direita = direita;
    }

    public Posicao getTopo() {
        return topo;
    }

    public void setTopo(Posicao topo) {
        this.topo = topo;
    }

    @Override
    public String toString() {
        return "[" + String.valueOf(valor) + ", " + String
                        .valueOf(this.esquerda) + ", " + String
                        .valueOf(this.direita) + "]";
    }

}
