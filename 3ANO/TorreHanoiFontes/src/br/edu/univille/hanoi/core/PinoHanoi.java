package br.edu.univille.hanoi.core;

import br.edu.univille.hanoi.core.exception.PinoCheioException;
import br.edu.univille.hanoi.core.exception.PinoVazioException;

public abstract class PinoHanoi {

    // M�todo que retorna a quantidade de discos no pino
    public abstract int size();

    // Metodoque indica se o pino est� vazia
    public abstract boolean isEmpty();

    // Metodo que retorna o disco no topo do pino sem retir�-lo
    public abstract Disco top() throws PinoVazioException;

    // M�todo que adiciona um disco ao topo da pino
    public abstract void push(Disco disco) throws PinoCheioException;

    // M�todo que retira um disco do topo da pino.
    public abstract Disco pop() throws PinoVazioException;

    // M�todo que inicializa o pino com a capacidade de discos suportada
    public abstract void init(int tamanho);

    // M�todo que retorna o array com os discos do pino
    public abstract Disco[] getDiscos();

    // M�todo que imprime uma representa��o do estado dos discos
    public void imprime(char[][] c, int pino) {
        Disco[] discos = getDiscos();
        int tamanho = discos.length;
        int inicio = (tamanho * 2 + 1) * (pino - 1) + (pino - 1);
        int meio = tamanho + inicio;
        c[0][meio] = '|';
        int topo = size();
        for (int i = tamanho - 1; i >= 0; i--) {
            if (i >= topo) {
                c[tamanho - i][meio] = '|';
            } else {
                int t = discos[i].tamanho();
                for (int j = meio - t; j < meio + t + 1; j++) {
                    c[tamanho - i][j] = '=';
                }
            }
        }
        c[tamanho + 1][meio] = (char) (pino + 48);
    }

}
