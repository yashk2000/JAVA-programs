public class Driver {
	public static void main(String[] args) {
		Stack S = new Stack();
		S.push(456);
		S.push(123);
		S.push(789);
		S.push(345);
		S.push(423);
		S.push(678);
		S.Traversal();
		S.Pop();
		S.Pop();
		System.out.println("\nStack after two pops");
		S.Traversal();
	}

}
