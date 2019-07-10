public class Node {
	int data;
	char c;
	Node prev, next;

	Node(int d) {
		data = d;
		prev = next = null;
	}

	Node(char ch) {
		c = ch;
		data = 0;
		prev = next = null;
	}

	Node() {
		data = 0;
		prev = next = null;
	}

}
