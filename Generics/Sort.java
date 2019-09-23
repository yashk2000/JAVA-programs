import java.util.Arrays;
public class Sort {
	public static <T> void SortGenerics(T[] arr) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
