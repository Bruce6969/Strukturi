import linkedlist.LinkedList;
import linkedlist.Node;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		for (int i = 0; i < 10; i++) {
			Node node = new Node(i, "");
			linkedList.addFirst(node);
		}
		linkedList.printAllElements();
	}

}
