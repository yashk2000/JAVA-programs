public class Driver {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.ll();
		driver.rr();
	}

	public void ll() { 
		Tree avl = new Tree();
		System.out.println("Insertion sequence: 78, 67, 12");
		avl.insert(78); avl.insert(67); avl.insert(12);
		System.out.print("preorder: "); avl.preorder();
		System.out.print("inorder: "); avl.inorder();
	}

	public void rr() { 
		Tree avl = new Tree();
		System.out.println("Insertion sequence: 12, 56, 78, 34");
		avl.insert(12); avl.insert(56); avl.insert(78); avl.insert(34);
		System.out.print("preorder: "); avl.preorder();
		System.out.print("inorder: "); avl.inorder();
	}
}
