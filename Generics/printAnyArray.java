public class printAnyArray {
	public static <T> void printArray(T[] arr) 		{
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i].getClass());
			System.out.println(arr[i].getClass().getGenericSuperclass());
			System.out.println(arr[i]);
		}
	}
}	
