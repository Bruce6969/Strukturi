package linkedlist;

/** The node class....explanation */
public class Node {
	private int intValue;
	private String stringValue;
	private Node next;
	private Node previous;

	public Node(int intValue, String stringValue) {
		this.intValue = intValue;
		this.stringValue = stringValue;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	@Override
	public String toString() {
		return stringValue + "" + intValue;
	}
}
