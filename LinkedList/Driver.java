public class Driver {
	public static void main(String[]args) {
		Linkedist ll = new Linkedist();
		ll.insertNode(89);
		ll.insertNode(9);
		ll.insertNode(56);
		ll.printList();
		System.out.println("There are "+ll.numberOfNodes() + " nodes");
		ll.printMiddle();
		int c = ll.search(9);
		if(c == -1)
			System.out.println("Not found");
		else
			System.out.println("Number was found at " + c);
		ll.rotate(1);
	}
}
