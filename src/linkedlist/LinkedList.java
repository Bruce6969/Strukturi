package linkedlist;

public class LinkedList {

	private Node first;

	
	public LinkedList() {
		this.first = null;
	}
	/*
	 * ########################################### ######## Getters/Setters
	 * ################## ###########################################
	 */
	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	/*
	 * ########################################### ######## Methods/Funckii
	 * ################## ###########################################
	 */
	public void addFirst(Node node) {
		if (this.first == null) {
			this.first = node;
			this.first.setNext(null);
		}
		else {
			node.setNext(first);
			this.first = node;
		}
		
	}

	public void addSecond(Node firstNode, Node secondNode) {
		addFirst(firstNode);
		secondNode.setNext(first.getNext());
		first.setNext(secondNode);
	}

	public void printAllElements() {
		Node current = this.first;
		while (current.getNext() != null) {
			System.out.print(current + "->");
			current = current.getNext();
		}
		System.out.print(current + "->null");
		System.out.println();
	}

}
