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
		} else {
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
		Node current = first;
		while (current.getNext() != null) {
			System.out.print(current + "->");
			current = current.getNext();
		}
		System.out.print(current + "->null");
		System.out.println();
	}

	public void deleteFirstElement() {
		first = first.getNext();
	}

	public int getNumberOfElementsInList() {
		int numberOfElementsInList = 0;
		Node current = first;
		do {
			numberOfElementsInList++;
			if (current.getNext() != null) {
				current = current.getNext();
			}
		} while (current.getNext() != null);
		return numberOfElementsInList;
	}

	public int[] getElements() {
		int numberOfElementsInList = getNumberOfElementsInList();
		int[] elementsInList = new int[numberOfElementsInList];
		int i = 0;
		Node current = first;
		do {
			elementsInList[i] = current.getIntValue();
			if (current.getNext() != null) {
				i++;
				current = current.getNext();
			}
		} while (current.getNext() != null);

		return elementsInList;
	}

}
