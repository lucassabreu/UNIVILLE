package br.univille.arranjos.aula2;

public class SLinkedList {
	protected Node head;
	protected long size;

	public SLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public long getSize() {
		return size;
	}

	public void addFirst(Node node) {
		node.setNext(this.head);
		this.head = node;
		this.size++;
	}

	public void addLast(Node node) {
		if (this.head == null) {
			this.head = node;
		} else {
			Node last = this.head;

			while (last.getNext() != null)
				last = last.getNext();

			last.setNext(node);
		}

		node.setNext(null);
		this.size++;
	}

	public void removeLast() {
		if (this.head == null)
			throw new NullPointerException("A lista esta vazia !");

		this.size--;

		if (this.head.getNext() == null)
			this.head = null;
		else {
			Node prev = this.head;
			Node tail = this.head.getNext();

			while (tail.getNext() != null) {
				prev = tail;
				tail = prev.getNext();
			}

			prev.setNext(null);
		}
	}

	public static void main(String[] args) {
		SLinkedList list = new SLinkedList();

		list.print();

		System.out.println(//
				"(" + list.getSize() + ") -----------------------------");

		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0)
				list.addLast(new Node("Element " + (i + 1)));
			else
				list.addFirst(new Node("Element " + (i + 1)));

			list.print();
			System.out.println(//
					"(" + list.getSize() + ") -----------------------------");
		}

		list.print();
		System.out.println(//
				"(" + list.getSize() + ") -----------------------------");

		while (list.getSize() > 0) {

			System.out.println( //
					"(" + list.getSize() + ") -----------------------------");
			list.removeLast();
			list.print();
		}
	}

	public void print() {

		if (head == null)
			System.out.println("Lista vazio");
		else {
			Node tail = this.head;

			while (tail != null) {
				System.out.println(tail.getElement());
				tail = tail.getNext();
			}
		}
	}

	@Override
	public String toString() {
		if (this.size > 0)
			return "[" + this.head.toString() + "]";
		else
			return "[]";
	}
}
