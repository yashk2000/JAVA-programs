import java.util.Scanner;
public class Linkedist {
	Node head;
	
	public void insertNode(int d) {
		Node newNode = new Node(d);
		newNode.next = null;
		
		if(head == null) {
			head = newNode; 
		} else {
			Node temp = head;
			while(temp.next != null) 
				temp = temp.next;
			temp.next = newNode;
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public int numberOfNodes() {
		int c = 0;
		Node temp = head;
		while(temp != null) {
			++c;
			temp = temp.next;
		}
		return c;
	}
	
	public void printEven() {
		Node temp = head;
		while(temp != null) {
			if(temp.data % 2 == 0) {
				System.out.println(temp.data);
			}
			temp = temp.next;
		}
	}
	
	public void printMiddle() {
		int n = numberOfNodes();
		Node temp = head;
		int c = 0;
		while(c != n/2) {
			temp = temp.next;
			++c;
		}
		System.out.println("The middle element is "+ temp.data);
	}
	
	public int search(int a) {
		Node temp = head;
		int c = 0;
		while(temp != null) {
			if (temp.data == a) {
				return c+1;
			}
			temp = temp.next;
			++c;
		}
		return -1;
	}
	
	public void insertSorted(int a) {
		Node temp = head;
		while(a > temp.data)
			temp = temp.next;
		Node newNode = new Node(a);
		Node ptr = temp.next;
		temp.next = newNode;
		newNode.next = ptr;
	}
	
	public void rotate(int k) {
		if (k == 0) 
			return; 
        Node temp  = head; 
           int c = 1; 
        while (c < k && temp !=  null) {
        	temp = temp.next; 
            c++; 
        } 
        if (temp == null) 
           return; 
        Node node = temp; 
        while (temp.next != null) 
            temp = temp.next; 
        temp.next = head; 
        head = node.next; 
        node.next = null; 
        System.out.println("Rotated list: ");
        printList();
	}
}
