public class DoubleLinkedList {
	public Node head = null;

	public void Traversal() {
		Node temp = head;
		while (temp != null) {
			System.out.printf("%d<-", temp.data);
			temp = temp.next;
		}
	}

	public void InsertAtHead(int d) {
		Node newnode = new Node(d);
		if (head == null) {
			head = newnode;
		} else {
			head.prev = newnode;
			newnode.next = head;
			newnode.prev = null;
			head = newnode;
		}
	}

	public void InsertAtEnd(int d) {
		Node newnode = new Node(d);
		Node temp;
		if (head == null)
			head = newnode;
		else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.prev = temp;
			newnode.next = null;
		}
	}

	public void InsertAtAny(int pos, int d) {
		Node temp;
		if (head == null) {
			InsertAtHead(d);
		} else {
			temp = head;
			int k = 0;
			while (k < pos - 1) {
				temp = temp.next;
				k++;
			}
			Node newnode = new Node(d);
			newnode.next = temp.next;
			newnode.prev = temp;
			newnode.next.prev = newnode;
			temp.next = newnode;
		}
	}

	public void DeleteAtK(int k) {
		if (k == 1) {
			head.next.prev = null;
			head = head.next;
		} else {
			Node temp = head;
			for (int i = 0; i < k - 2; i++) {
				temp = temp.next;
			}
			if (temp.next.next != null) {
				Node temp2 = temp.next.next;
				temp2.prev = temp;
				temp.next = temp2;
			} else {
				temp.next = null;
			}
		}
	}
}
