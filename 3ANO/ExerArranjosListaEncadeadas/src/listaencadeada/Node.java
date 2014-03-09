package listaencadeada;

import gameentry.GameEntry;

public class Node {
	private GameEntry element = null;
	private Node next = null;

	public Node(GameEntry element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setElement(GameEntry element) {
		this.element = element;
	}

	public GameEntry getElement() {
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
