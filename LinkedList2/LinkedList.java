import java.util.Arrays;

public class LinkedList {
	public Node head = null;

	public void InsertAtHead(int d) {
		Node newnode = new Node(d);
		newnode.next = head;
		head = newnode;
	}

	public void Traversal() {
		Node temp = head;
		while (temp != null) {
			System.out.printf("%d<-", temp.data);
			temp = temp.next;
		}
	}

	public void InsertEnd(int d) {
		Node newnode = new Node(d);
		Node temp;
		if (head == null)
			head = newnode;
		else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}

	public void Insert(int pos, int d) {
		Node temp;
		temp = head;
		int k = 1;
		while (k < pos - 1) {
			temp = temp.next;
			k++;
		}
		Node newnode = new Node(d);
		newnode.next = temp.next;
		temp.next = newnode;
	}

	public void Search(int d) {
		Node temp = head;
		int c = 0;
		while (temp != null) {
			if (d == temp.data) {
				System.out.println("found in " + c + " position");
				break;
			}
			c++;
			temp = temp.next;
		}

	}

	public int Count() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void CountEven() {
		Node temp = head;
		while (temp != null) {
			if (temp.data % 2 == 0)
				System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public void FindMid() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		temp = head;

		if (count % 2 != 0) {
			int trav = 0;
			while (trav < count / 2) {
				temp = temp.next;
				trav++;
			}
			System.out.println("The middle element is " + temp.data);
		} else {
			int trav = 0;
			while (trav < (count / 2) - 1) {
				temp = temp.next;
				trav++;
			}
			Node temp2 = temp.next;
			System.out.println("The middle element is " + temp.data + " and " + temp2.data);
		}

	}

	public void InsertSorted(int d) {
		int flag = 0;
		Node newnode = new Node(d);
		Node temp1 = head;
		if (head == null) {
			head = newnode;
			flag = 1;
		}

		else {
			if (d < head.data && flag == 0) {
				newnode.next = head;
				head = newnode;
				flag = 1;
			}
			if (head.next == null && flag == 0) {
				head.next = newnode;
				flag = 1;
			}

			Node temp = temp1.next;

			while (temp != null && flag == 0) {
				if (d < temp.data) {
					newnode.next = temp1.next;
					temp1.next = newnode;
					flag = 1;
					break;

				}
				temp = temp.next;
				temp1 = temp1.next;
			}
		}
		if (flag == 0) {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;

		}

	}

	public void DeleteHead() {
		head = head.next;
	}

	public void DeleteTail() {
		Node temp;

		temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

	}

	public void Delete(int k) {
		Node temp;
		temp = head;
		int pos = 1;
		while (pos < k - 1) {
			temp = temp.next;
			pos++;
		}
		temp.next = temp.next.next;

	}

	public void FindMiddle() {
		Node sp, fp;
		sp = fp = head;
		while (fp.next != null) {
			sp = sp.next;
			fp = fp.next.next;
		}
		System.out.println("The middle element is " + sp.data);
	}

	public void Sort() {
		Node temp;
		temp = head;
		int[] a = new int[Count()];
		int i = 0;
		while (temp != null) {
			a[i] = temp.data;
			temp = temp.next;
			i++;

		}
		Arrays.sort(a);
		temp = head;
		i = 0;
		while (temp != null) {
			temp.data = a[i];
			temp = temp.next;
			i++;

		}

	}

	public void Rotate(int k) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		temp = head;
		for (int i = 0; i < k - 1; i++) {
			temp = temp.next;
		}
		head = temp.next;
		temp.next = null;
	}

	public void Duplicate() {
		Node temp, temp1;
		if (head == null)
			System.out.println("Empty List");
		else {

			temp = head;

			while (temp.next != null) {
				temp1 = temp.next;
				while (temp1 != null) {
					if (temp.data == temp1.data) {
						temp.next = temp1.next;
						temp1 = temp1.next;
					}
					if (temp1 == null)
						temp1 = null;
					else
						temp1 = temp1.next;

				}
				if (temp.next == null)
					break;
				else
					temp = temp.next;
			}
		}

	}

	public void Reverse() {

		Node prev = null, next = null;
		Node cur = head;
		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;

	}

	public void Loop() {
		int flag = 0;
		Node sp = head, fp = head;
		while (sp != null && fp != null && fp.next != null) {
			sp = sp.next;
			fp = fp.next.next;
			if (sp == fp) {
				System.out.println("\nCycle found");
			} else
				flag = 1;
		}
		if (flag == 1)
			System.out.println("\nNo cycle found");
	}

	public LinkedList Sort(LinkedList L1, LinkedList L2) {
		Node temp, temp1;
		temp = L1.head;
		temp1 = L2.head;
		LinkedList L3 = new LinkedList();
		while ((temp1 != null) && (temp != null)) {
			if (temp.data < temp1.data) {
				L3.InsertEnd(temp.data);
				temp = temp.next;
			} else {
				L3.InsertEnd(temp1.data);
				temp1 = temp1.next;
			}
		}
		while (temp != null) {
			L3.InsertEnd(temp.data);
			temp = temp.next;
		}
		while (temp1 != null) {
			L3.InsertEnd(temp1.data);
			temp1 = temp1.next;
		}

		return L3;
	}

	public LinkedList Intersection(LinkedList L1, LinkedList L2) {
		LinkedList L3 = new LinkedList();
		Node temp = L1.head;
		Node temp1 = L2.head;
		while (temp != null) {
			while (temp1 != null) {
				if (temp.data == temp1.data)
					L3.InsertEnd(temp.data);
				temp1 = temp1.next;
			}
			temp = temp.next;
		}
		return L3;

	}

	public LinkedList Union(LinkedList L1, LinkedList L2) {
		LinkedList L3 = new LinkedList();
		Node temp, temp1;
		temp = L1.head;
		temp1 = L2.head;
		while (temp != null) {
			L3.InsertEnd(temp.data);
			temp = temp.next;
		}
		while (temp1 != null) {
			L3.InsertEnd(temp1.data);
			temp1 = temp1.next;
		}

		return L3;

	}

	public LinkedList Partition(LinkedList L1, int pivot) {
		Node temp = L1.head;
		LinkedList L3 = new LinkedList();
		while (temp != null) {
			if (temp.data < pivot) {
				L3.InsertAtHead(temp.data);
			} else
				L3.InsertEnd(temp.data);

			temp = temp.next;
		}
		return L3;
	}

}
