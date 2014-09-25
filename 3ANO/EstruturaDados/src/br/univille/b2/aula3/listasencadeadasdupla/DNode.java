package br.univille.b2.aula3.listasencadeadasdupla;

public class DNode {
    private String element;
    private DNode  prev;
    private DNode  next;

    public DNode() {
        this.element = null;
        this.prev = null;
        this.next = null;
    }

    public DNode(String element) {
        this();
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }
    
    @Override
    public String toString() {
        return this.getElement();
    }

}
