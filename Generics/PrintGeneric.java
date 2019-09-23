public class PrintGeneric {
	public static <T> void printAnyType(T x) {
		System.out.println("I am a variale of " + x.getClass());
		System.out.println("The parent of my " + x.getClass().getGenericSuperclass());
		System.out.println(x);
		System.out.println();
	}
}
