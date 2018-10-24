class LinkedList<E> {
	/**
	 * Class for node.
	 */
	class Node {
		E data;
		Node link;
	}
	Node head;
	int size;
	/**
	 * insertAtStart method.
	 * The time Complexity is O(1).Because only one if condition is
	 * enough to insert at start position.
	 *
	 * @param      data  The data
	 */
	void insertAtStart(E data) {
		Node node = new Node();
		size++;
		if (head == null) {
			node.data = data;
			node.link = null;
			head = node;
		} else {
			node.data = data;
			node.link = head;
			head = node;
		}
	}
	/**
	 * insertAtEnd method.
	 * The time Complexity is O(N).Because insert takes N
	 * iterations to insert an element at the end position.
	 *
	 * @param      data  The data
	 */
	void insertAtEnd(E data) {
		Node node = new Node();
		size++;
		if (head == null) {
			node.data = data;
			node.link = null;
			head = node;
		} else {
			Node temp = head;
			while (temp.link != null) {
				temp = temp.link;
			}
			node.data = data;
			temp.link = node;
			node.link = null;
		}
	}
	/**
	 * insertAtPos method.
	 * The time Complexity is O(N).Because insert takes N
	 * iterations to insert an element at a given position.
	 *
	 * @param      data  The data
	 * @param      pos   The position
	 */
	void insertAtPos(E data, int pos) {
		Node node = new Node();
		if (pos == 0) {
			return;
		}
		if (pos == 1) {
			insertAtStart(data);
			return;
		}
		pos--;
		Node temp = head;
		while (pos != 1) {
			temp = temp.link;
			pos--;
		}
		node.data = data;
		node.link = temp.link;
		temp.link = node;
		size++;
	}
	/**
	 * deleteAtStart method.
	 * The time Complexity is O(1).Because delete takes only one
	 * iteration to delete an element from the start position.
	 */
	void deleteAtStart() {
		if (size == 0) {
			return;
		}
		Node node = new Node();
		Node temp = head;
		temp = temp.link;
		head.link = null;
		head = temp;
		size--;
	}
	/**
	 * deleteAtEnd method.
	 * The time Complexity is O(N).Because delete takes N
	 * iterations to delete an element at the end position.
	 */
	void deleteAtEnd() {
		Node node = new Node();
		Node temp = head;
		while (temp.link.link != null) {
			temp = temp.link;
		}
		temp.link = null;
		size--;
	}
	/**
	 * deleteAtPos method.
	 * The time Complexity is O(N).Because delete takes N
	 * iterations to delete an element at a given position.
	 */
	void deleteAtPos(int pos) {
		if (pos == 0) return;
		if (pos == 1) {
			deleteAtStart();
			return;
		}
		pos--;
		Node temp = head;
		while (pos != 1) {
			temp = temp.link;
			pos--;
		}
		temp.link = temp.link.link;
		size--;
	}
	/**
	 * display method.
	 * The time Complexity is O(N).Iterating through the N elements
	 * in a linked list.
	 */
	void display() {
		if (size == 0) {
			System.out.println("Empty");
			return;
		}
		if (head.link == null) {
			System.out.println(head.data);
			return;
		}
		Node temp = head;
		while (temp.link != null) {
			System.out.print(temp.data + "->");
			temp = temp.link;
		}
		System.out.println(temp.data);
	}
	/**
	 * overloaded display method.
	 * The time Complexity is O(N).Iterating through the N elements
	 * in a linked list.
	 */
	void display1() {
		if (size == 0) {
			System.out.println("Steque is empty.");
			return;
		}
		if (head.link == null) {
			System.out.println(head.data);
			return;
		}
		Node temp = head;
		while (temp.link != null) {
			System.out.print(temp.data + ", ");
			temp = temp.link;
		}
		System.out.println(temp.data);
	}
}
