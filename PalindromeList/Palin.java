public class Palin {
	public String s = "";
	public Node top = null;

	public void push(char d) {
		Node newnode = new Node(d);
		newnode.next = top;
		top = newnode;
	}

	public void reverse() {
		if (top == null)
			System.out.println("Stack Underflow");
		else {
			s += top.c;
			top = top.next;
		}

	}

}
