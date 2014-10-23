package br.univille.estd.lucasabreu;

import java.io.PrintStream;

import br.edu.univille.arvore.Arvore;

public class ArvoreLucasAbreu implements Arvore {

    protected Posicao raiz;
    protected int     tamanho;

    public static void main(String[] args) {
        int[] vs = new int[] { 22, 26, 11, 25, 23, 24, 13, 14, 7, 30, 15, 3, 6,
                27, 5, 20, 28, 18, 4, 29, 10, 1, 17, 19, 21, 9, 8, 12, 2, 16 };

        Arvore a = new ArvoreLucasAbreu();

        for (int v : vs)
            a.adicionaValor(v);

        a.imprimirArvore(System.out);
    }

    @Override
    public void adicionaValor(Integer valor) {
        if (this.raiz == null)
            this.raiz = this.criarPosicao(null, valor);
        else
            this.adicionarValorParaPosicao(this.raiz, valor);
    }

    public void adicionarValorParaPosicao(Posicao posicao, int valor) {
        if (posicao == null)
            return;

        int maiorDistanciaEsquerda = 0;
        int maiorDistanciaDireita = 0;

        if (valor > posicao.getValor()) {
            if (posicao.getDireita() == null) {
                posicao.setDireita(this.criarPosicao(posicao, valor));
            } else {
                this.adicionarValorParaPosicao(posicao.getDireita(), valor);
            }
        } else {
            if (posicao.getEsquerda() == null) {
                posicao.setEsquerda(this.criarPosicao(posicao, valor));
            } else {
                this.adicionarValorParaPosicao(posicao.getEsquerda(), valor);
            }
        }

        if (posicao.getEsquerda() != null)
            maiorDistanciaEsquerda = posicao.getEsquerda().getMaiorDistancia() + 1;

        if (posicao.getDireita() != null)
            maiorDistanciaDireita = posicao.getDireita().getMaiorDistancia() + 1;

        posicao.setBalanco(maiorDistanciaEsquerda - maiorDistanciaDireita);

        if (maiorDistanciaDireita > maiorDistanciaEsquerda)
            posicao.setMaiorDistancia(maiorDistanciaDireita);
        else
            posicao.setMaiorDistancia(maiorDistanciaEsquerda);

    }

    protected Posicao criarPosicao(Posicao topo, int valor) {
        Posicao posicao = new Posicao();

        posicao.setTopo(topo);
        posicao.setValor(valor);
        this.tamanho++;

        return posicao;
    }

    @Override
    public void imprimirArvore(PrintStream out) {
        StringBuilder sb = new StringBuilder();
        this.listarPreOrderPosicao(this.raiz, sb);
        out.print(sb);
    }

    protected void listarPreOrderPosicao(Posicao posicao, StringBuilder sb) {
        if (posicao == null)
            return;

        sb.append(posicao.getValor()).append(' ') //
                        .append(posicao.getMaiorDistancia()).append(' ') //
                        .append(posicao.getBalanco()).append('\n');
        this.listarPreOrderPosicao(posicao.getEsquerda(), sb);
        this.listarPreOrderPosicao(posicao.getDireita(), sb);
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return String.valueOf(this.raiz);
    }
}
