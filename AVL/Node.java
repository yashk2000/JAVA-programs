package newthingy;

public class Node {
    protected int data;
    protected Node left;
    protected Node right;

    protected int balanceFactor;

    public Node() { };
    public Node(int d) {
        data = d;
        balanceFactor = 0;
    }

    public Node insert(int key) {
        if (key < data)  { 
            if (left == null)  
                left = new Node(key);
            else  
                left = left.insert(key);
        }
        else {  
            if (right == null) 
                right = new Node(key);
            else  
                right = right.insert(key);
        }

        balanceFactor = computeBalance();
        switch(balanceFactor) {
        case 2: 
        	if (left.balanceFactor >= 0) 
        		return rotateWithLeftChild();
        	else {                        
        		left = left.rotateWithRightChild();
       			return rotateWithLeftChild();        	
         	}

       	case -2:  
       		if (right.balanceFactor <= 0) 
       			return rotateWithRightChild();
       		else {                         
       			right = right.rotateWithLeftChild();
       			return rotateWithRightChild();
       		}
        }
        return this;
    }

    public void inorder() {
        if (left != null)  
            left.inorder();
        System.out.print(data + " ");
        if (right != null)  
            right.inorder();
    }

    public void preorder() {
        System.out.print(data + " ");
        if (left != null)  
            left.preorder();
        if (right != null)  
            right.preorder();
    }

    public void postorder() {
        if (left != null)
            left.postorder();
        if (right != null)
            right.postorder();
        System.out.print(data + " ");
    }

    public boolean search(int key) {
        if (key == data)
            return true;
        else if (key < data && left != null)
            return left.search(key);
        else if (key > data && right != null)
            return right.search(key);
        else
            return false;
    }

    public void delete(int key) {
    	if (left != null && left.data == key) { 
    		if (left.isLeaf())             
    			left = null;
    		else if (left.hasOnlyLeft())  
    			left = left.left;
    		else if (left.hasOnlyRight())
    			left = left.right;
    		else {                        
    			if (left.left.hasOnlyLeft() || left.left.isLeaf()) { 
    				left.data = left.left.data; 
    				left.left = left.left.left; 
    			}
    			else { 
    				Node predParent = left.left;
    				Node pred = predParent.right;
    				while (pred.right != null) { 
    					predParent = pred; 
    					pred = pred.right; 
    				}
    				left.data = pred.data;  
    				predParent.right = pred.left; 
    			}    			
    		}
    	}
    	else if (right != null && right.data == key) {  
    		if (right.isLeaf())
    			right = null;
    		else if (right.hasOnlyLeft())
    			right = right.left;
    		else if (right.hasOnlyRight())
    			right = right.right;
    		else {
    			if (right.left.hasOnlyLeft() || right.left.isLeaf()) {
    				right.data = right.left.data;
    				right.left = right.left.left;
    			}
    			else {
    				Node predParent = right.left;
    				Node pred = predParent.right;
    				while (pred.right != null) {
    					predParent = pred;
    					pred = pred.right;
    				}
    				right.data = pred.data;
    				predParent.right = pred.left;
    			}    			
    		}
    	}
    	else if (left != null && key < data)
    		left.delete(key);
    	else if (right != null && key >= data)
    		right.delete(key);
    }

    public boolean isLeaf() {
        if (left == null && right == null)
            return true;
        else
            return false;
    }

    public boolean hasOnlyLeft() {
    	if (left != null && right == null)
    		return true;
    	else
    		return false;
    }

    public boolean hasOnlyRight() {
    	if (left == null && right != null)
    		return true;
    	else
    		return false;
    }

    public int height() {
    	if ( isLeaf() )
    		return 0;
    	else if (hasOnlyLeft()) 
    		return left.height() + 1;
    	else if (hasOnlyRight())
    		return right.height() + 1;
		else
    		return max(left.height(), right.height()) + 1;
    }

    public int max(int a, int b) {
    	if (a > b)
    		return a;
    	else
    		return b;
    }

    public Node rotateWithLeftChild() {
    	Node lc = left;
    	left = lc.right;
    	lc.right = this;
    	computeBalance(); lc.computeBalance();
    	return lc;
    }

    public Node rotateWithRightChild() {
    	Node rc = right;
    	right = rc.left;
    	rc.left = this;
    	computeBalance(); rc.computeBalance();
    	return rc;
    }

    public int computeBalance() {
        if (isLeaf()) return 0;
        else if (hasOnlyLeft()) return left.height()+1;
        else if (hasOnlyRight()) return -1 * (right.height()+1);
        else	return left.height() - right.height();
    }
}
