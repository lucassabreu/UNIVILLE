package br.univille.aula5.pilha;

public class ArrayStack<E> implements Stack<E> {
    // Capacidade real arranjo
    private int             capacity;
    // Capacidade default através de uma constante
    public static final int CAPACITY = 1000;
    // Arranjo genérico para implementar a pilha
    private E               elements[];
    // Indice para o topo da pilha
    private int             top      = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int cap) {
        capacity = cap;
        elements = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public E pop() throws EmptyStackException {
        if (this.isEmpty())
            throw new EmptyStackException("A pilha esta vazia, não pode ser removido mais nenhum item");

        E elem = this.elements[this.top];
        this.elements[this.top] = null;
        this.top--;

        return elem;
    }

    public void push(E element) {

        if (this.size() == this.capacity)
            throw new IndexOutOfBoundsException("O tamanho limite da pilha já foi atingido");

        this.top++;
        this.elements[this.top] = element;
    }

    public int size() {
        return this.top + 1;
    }

    public E top() throws EmptyStackException {
        if (this.isEmpty())
            throw new EmptyStackException("A pilha esta vazia, não pode ser removido mais nenhum item");

        return this.elements[this.top];
    }
    
    public static void main(String[] args) {
        ArrayStack<String> as = new ArrayStack<>();

        System.out.println("IsEmpty: " + as.isEmpty());
        
        as.push("Elemento " + as.size());

        System.out.println("IsEmpty: " + as.isEmpty());
        System.out.println("Top: " + as.top());
        System.out.println("Pop: " + as.pop());
        System.out.println("IsEmpty: " + as.isEmpty());
        
        System.out.println("\nTeste com massa:");
        for(int i = 0; i < 20; i++) {
            as.push("Elemento " + as.size());
            System.out.println("Elemento: " + as.top() + ", Size: " + as.size() + ", IsEmpty: " + as.isEmpty());
        }
        
        System.out.println("Limpando pilha: ");
        while(!as.isEmpty()){
            System.out.println("Pop: " + as.pop() + ", Size: " + as.size() + ", IsEmpty: " + as.isEmpty());
        }

        as.size();
    }
}
