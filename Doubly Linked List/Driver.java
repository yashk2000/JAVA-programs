public class Driver {
	public static void main(String args[]) {
		DoubleLinkedList L1 = new DoubleLinkedList();
		L1.InsertAtHead(106);
		L1.InsertAtEnd(121);
		L1.InsertAtAny(1, 115);
		L1.InsertAtEnd(1334);
		L1.InsertAtEnd(1490);
		L1.Traversal();
		System.out.println("\nDelete at k executed ");
		L1.DeleteAtK(1);
		L1.Traversal();

	}
}
