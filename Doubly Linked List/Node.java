public class Node {
	int data;
	Node prev, next;

	Node(int d) {
		data = d;
		prev = next = null;
	}

	Node() {
		data = 0;
		prev = next = null;
	}

}
