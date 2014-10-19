package br.univille.lucasabreu.arvore;

public class Posicao {
    private Posicao esquerda;
    private Posicao direita;
    private Posicao topo;
    private int     valor = 0;

    /**
     * Balanço
     * 
     * @return
     */
    public int getBalanco() {

        int pesoEsquerda = 0;
        int pesoDireita = 0;

        if (this.direita != null)
            pesoDireita = this.direita.getMaiorDistancia() + 1;

        if (this.esquerda != null)
            pesoEsquerda = this.esquerda.getMaiorDistancia() + 1;

        return pesoEsquerda - pesoDireita;
    }

    public int getMaiorDistancia() {
        int pesoEsquerda = 0;
        int pesoDireita = 0;

        if (this.direita != null) {
            pesoDireita = this.direita.getMaiorDistancia() + 1;
        }

        if (this.esquerda != null) {
            pesoEsquerda = this.esquerda.getMaiorDistancia() + 1;
        }

        if (pesoDireita > pesoEsquerda)
            return pesoDireita;
        else
            return pesoEsquerda;
    }

    public int getValor() {
        return valor;
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
