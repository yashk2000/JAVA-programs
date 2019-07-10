public class Stack {
	public Node top = null;

	public void push(int d) {
		Node newnode = new Node(d);
		newnode.next = top;
		top = newnode;
	}

	public void Pop() {
		if (top == null)
			System.out.println("Stack Underflow");
		else {
			top = top.next;
		}
	}

	public void Traversal() {
		Node temp = top;
		while (temp != null) {
			System.out.printf("%d<-", temp.data);
			temp = temp.next;
		}
	}
}
