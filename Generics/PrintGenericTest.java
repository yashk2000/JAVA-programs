public class PrintGenericTest {
	public static void main(String[]args) {
		PrintGeneric.printAnyType(new Integer(10));
		PrintGeneric.printAnyType(new Double(10.5));
		PrintGeneric.printAnyType(new Character('c'));
		PrintGeneric.printAnyType(new String("Generics"));
	}
}
