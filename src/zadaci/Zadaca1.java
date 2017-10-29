package zadaci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import linkedlist.LinkedList;
import linkedlist.Node;

public class Zadaca1 {
	public static void main(String[] args) {
		LinkedList firstLinkedList = new LinkedList();
		LinkedList secondLinkedList = new LinkedList();

		for (int i = 7; i > 4; i--) {
			firstLinkedList.addFirst(new Node(i, ""));
		}
		for (int i = 5; i > 2; i--) {
			secondLinkedList.addFirst(new Node(i, ""));
		}
		System.out.println("First list : ");
		firstLinkedList.printAllElements();
		System.out.println("Second list : ");
		secondLinkedList.printAllElements();
		LinkedList thirdLinkedList = slay(firstLinkedList, secondLinkedList);
		System.out.println("Third list : ");
		thirdLinkedList.printAllElements();
	}

	public static LinkedList slay(LinkedList firstLinkList, LinkedList secondLinkedList) {
		LinkedList thirdLinkedList = new LinkedList();
		int[] elementsFromFirstList = firstLinkList.getElements();
		int[] elementsFromSecondList = secondLinkedList.getElements();
		HashSet<Integer> elementsForThirdList = new HashSet<>();
		for (int i = 0; i < elementsFromFirstList.length; i++) {
			elementsForThirdList.add(elementsFromFirstList[i]);
		}
		for (int i = 0; i < elementsFromSecondList.length; i++) {
			elementsForThirdList.add(elementsFromSecondList[i]);
		}
		List<Integer> thirdListSorted = new ArrayList<>(elementsForThirdList);
		Collections.sort(thirdListSorted);
		for (int i = thirdListSorted.size(); i > 0; i--) {
			int elementForThirdList = thirdListSorted.get(i - 1);
			thirdLinkedList.addFirst(new Node(elementForThirdList, ""));
		}
		return thirdLinkedList;
	}

}
