package newthingy;

import java.util.ArrayDeque;

public class Tree {
    protected Node root;

    public void insert(int key) {
        if (root == null)
            root = new Node(key);
        else
            root = root.insert(key);
    }

    public void inorder() {
        if (root == null)
            return;
        else
            root.inorder();
        System.out.println();
    }

    public void preorder() {
        if (root == null)
            return;
        else
            root.preorder();
        System.out.println();
    }

    public void postorder() {
        if (root == null)
            return;
        else
            root.postorder();
        System.out.println();
    } 
    
    public boolean search(int key) {
        if (root == null)
            return false;
        else
            return root.search(key);
    }

    public void delete(int key) {
        if (root == null)
            return;
        else if (root.data != key)
            root.delete(key);
        else { 
        	Node dummy = new Node(); 
            dummy.left = root;
            root = dummy;  

            root.delete(key); 

            root = root.left; 
        }
    }

	public void levelorder() {
		ArrayDeque<Node> deq = new ArrayDeque<Node>();
		deq.addLast(root);

		while ( !deq.isEmpty() ) { 
			Node n = deq.removeFirst();
			System.out.print(n.data + " ");
			if (n.left != null)
				deq.addLast(n.left);
			if (n.right != null)
				deq.addLast(n.right);
		}
		System.out.println();
	}

	public int height() {
		if (root == null)
			return 0;
		else
			return root.height();
	}
}
