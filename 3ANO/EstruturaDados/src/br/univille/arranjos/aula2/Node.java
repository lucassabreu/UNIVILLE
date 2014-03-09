package br.univille.arranjos.aula2;

public class Node {
	private String element = null;
	private Node next = null;

	public Node(String element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getElement() {
		return element;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.element);

		if (this.next != null) {
			sb.append(", ");
			sb.append(this.next.toString());
		}

		return sb.toString();
	}
}
