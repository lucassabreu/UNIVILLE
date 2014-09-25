package br.univille.b2.aula9.pilhas;

public class ArrayStack<E> implements Stack<E> {

    private int             capacity;
    public static final int CAPACITY = 1000;
    private E               s[];
    private int             top      = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.s = (E[]) new Object[this.capacity];
    }

    @Override
    public int size() {
        return this.top + 1;
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public E top() throws EmptyStackException {
        if (this.isEmpty())
            throw new EmptyStackException("A pilha não possui elementos ainda !");

        return this.s[this.top];
    }

    @Override
    public void push(E element) {

        if (this.size() == this.capacity)
            throw new FullStackException("A pilha já esta cheia, não podem ser inseridos novos elementos !");

        this.s[++this.top] = element;
    }

    @Override
    public E pop() throws EmptyStackException {
        if (this.isEmpty())
            throw new EmptyStackException("A pilha não possui elementos ainda !");

        return this.s[this.top--];
    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i <= this.top; i++) {
            sb.append(this.s[i]);
            sb.append(", ");
        }

        sb.replace(sb.length() - 2, sb.length() + 1, "]");
        return sb.toString();
    }

    public static void main(String[] args) {

        ArrayStack<Integer> as = new ArrayStack<Integer>(10);

        as.push(5);
        System.out.printf("      | %s\n", as);

        as.push(3);
        System.out.printf("      | %s\n", as);

        Integer i = as.pop();
        System.out.printf("%5d | %s\n", i, as);

        as.push(7);
        System.out.printf("      | %s\n", as);

        i = as.pop();
        System.out.printf("%5d | %s\n", i, as);

        i = as.top();
        System.out.printf("%5d | %s\n", i, as);

        i = as.pop();
        System.out.printf("%5d | %s\n", i, as);

        try {
            i = as.pop();
            System.out.printf("%5d | %s\n", i, as);
        } catch (Exception e) {
            System.out.printf("%5s | %s\n", "error", as);

        }

        boolean b = as.isEmpty();
        System.out.printf("%5s | %s\n", b ? "true" : "false", as);

        as.push(9);
        System.out.printf("      | %s\n", as);

        as.push(7);
        System.out.printf("      | %s\n", as);

        as.push(3);
        System.out.printf("      | %s\n", as);

        as.push(5);
        System.out.printf("      | %s\n", as);

        i = as.size();
        System.out.printf("%5d | %s\n", i, as);

        i = as.pop();
        System.out.printf("%5d | %s\n", i, as);

        as.push(8);
        System.out.printf("      | %s\n", as);

        i = as.pop();
        System.out.printf("%5d | %s\n", i, as);

        i = as.pop();
        System.out.printf("%5d | %s\n", i, as);
    }
}
