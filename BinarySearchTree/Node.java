public class Node {

	int k;
	Node r, l;
	
	public Node(int k) {
		this.k = k;
		r = l = null;
	}
	
	void insertNode(int data) {
		if (data < k) {
			if (l == null) {
				l = new Node(data);
			} else {
				l.insertNode(data);
			}
		} else {
			if (r == null) {
				r = new Node(data);
			} else {
				r.insertNode(data);
			}
		}
	}
	
	boolean searchData(int key) {
		if (key == k) {
			return true;
		} else if (key < k && l != null) {
			return l.searchData(key);
		} else if (key > k && r != null) {
			return r.searchData(key);
		} else
			return false;
	}
	
	void inOrder() {
		if (l != null) {
			l.inOrder();
		}
		System.out.println(k + " ");
		if (r != null) {
			r.inOrder();
		}
	}
	
	void preOrder() {
		System.out.println(k + " ");
		if (l != null) l.preOrder();
		if (r != null) r.preOrder();
	}
	
	void postOrder() {
		if (l != null) l.postOrder();
		if (r != null) r.postOrder();
		System.out.println(k + " ");
	}
}
