package br.univille.lucas.abreu.hanoi;

import br.edu.univille.hanoi.core.Disco;
import br.edu.univille.hanoi.core.PinoHanoi;
import br.edu.univille.hanoi.core.exception.PinoCheioException;
import br.edu.univille.hanoi.core.exception.PinoVazioException;

public class PinoHanoiImpl extends PinoHanoi {

    protected Disco[] discos;
    protected int     top = -1;

    @Override
    public Disco[] getDiscos() {
        return this.discos;
    }

    @Override
    public void init(int tamanho) {
        this.discos = new Disco[tamanho];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public Disco pop() throws PinoVazioException {
        if (this.isEmpty())
            throw new PinoVazioException();

        return this.discos[this.top--];
    }

    @Override
    public void push(Disco elem) throws PinoCheioException {
        if (this.size() == this.discos.length)
            throw new PinoCheioException();

        this.discos[++this.top] = elem;
    }

    @Override
    public int size() {
        return this.top + 1;
    }

    @Override
    public Disco top() throws PinoVazioException {
        if (this.isEmpty())
            throw new PinoVazioException();

        return this.discos[this.top];
    }

    @Override
    public void imprime(char[][] c, int pino) {
        // TODO Auto-generated method stub
        super.imprime(c, pino);
    }
}
