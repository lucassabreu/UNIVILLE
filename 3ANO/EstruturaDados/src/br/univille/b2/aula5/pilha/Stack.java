package br.univille.b2.aula5.pilha;

public interface Stack<E> {
    // Método que retorna o tamanho da pilha
    public int size();

    // Metodo que indica se a pilha está vazia
    public boolean isEmpty();

    // Metodo que retorna o item no topo da pilha sem retirá-lo
    public E top() throws EmptyStackException;

    // Método que adiciona um elemento ao topo da Pilha
    public void push(E element);

    // Método que retira um item do topo da pilha.
    public E pop() throws EmptyStackException;
}
