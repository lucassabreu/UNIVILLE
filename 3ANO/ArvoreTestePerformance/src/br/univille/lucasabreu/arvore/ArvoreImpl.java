package br.univille.lucasabreu.arvore;

import java.io.PrintStream;

import br.edu.univille.arvore.Arvore;

public class ArvoreImpl implements Arvore {

    protected Posicao raiz;
    protected int     tamanho;

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

        int balanco = posicao.getBalanco();

        for (int i = 0; i < 3 && Math.abs(balanco) > 1; i++) {
            this.balancear(posicao, balanco);
            balanco = posicao.getBalanco();
        }

    }

    protected void balancear(Posicao posicao, int balanco) {

        if (balanco == 0)
            return;

        Posicao topo = posicao.getTopo();
        Posicao aux = null;

        if (balanco > 0) {
            // guarda a Esquerda do Topo em aux;
            // a direita da Esquerda vai para a esquerda do Topo;
            // o topo da direita da Esquerda passa a ser o Topo, se houver a
            // direita da Esquerda;
            // o Topo vai para a direita da Esquerda;

            aux = posicao.getEsquerda();
            posicao.setEsquerda(aux.getDireita());
            if (aux.getDireita() != null)
                aux.getDireita().setTopo(posicao);
            aux.setDireita(posicao);
            posicao.setTopo(aux);
        } else {
            // guarda a Direita do Topo em aux;
            // a esquerda da Direita vai para a direita do Topo;
            // o topo da esquerda da Direita passa a ser o Topo, se houver a
            // esquerda da Direita;
            // o Topo vai para a esquerda da Direita;

            aux = posicao.getDireita();
            posicao.setDireita(aux.getEsquerda());
            if (aux.getEsquerda() != null)
                aux.getEsquerda().setTopo(posicao);
            aux.setEsquerda(posicao);
            posicao.setTopo(aux);
        }

        aux.setTopo(topo);
        if (topo != null) {
            if (topo.getEsquerda() == posicao)
                topo.setEsquerda(aux);
            else
                topo.setDireita(aux);
        } else {
            this.raiz = aux;
        }
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
