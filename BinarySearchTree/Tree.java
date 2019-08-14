public class Tree {

	Node root;
	
	Tree() {
		root = null;
	}
	
	void insert(int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			root.insertNode(data);
		}
	}
	
	void search(int key) {
		if (root == null) {
			System.out.println("Empty");
		} else System.out.println(root.searchData(key));
	}
	
	void inOrderCheck() {
		if (root == null) {
			System.out.println("Empty");
			return;
		} else root.inOrder();
	}
	
	void preOrderCheck() {
		if (root == null) {
			System.out.println("Empty");
			return;
		} else root.preOrder();
	}
	
	void postOrderCheck() {
		if (root == null) {
			System.out.println("Empty");
			return;
		} else root.postOrder();
	}
}
