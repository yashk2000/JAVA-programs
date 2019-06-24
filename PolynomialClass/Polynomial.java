import java.util.Scanner;
public class Polynomial {
	
	int[]arr = new int[9];
	
	public int[] get(int[]brr) {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<9;++i) {
			brr[i]=sc.nextInt();
		}
		return brr;
	}
	
	public void set(int[]brr) {
		for(int i=0;i<9;++i) {
			arr[i] = brr[i];
		}
	}
	
	public int degree(int arr[]) {
		int w[]= {9, 8, 7, 6, 5,4 ,3 , 2, 1};
		int i = 0;
		while (i<9 && arr[i] == 0) {
			++i;
		}
		return w[i];
	}
	
	public int[]add(int arr[], int arr2[]) {
		int[]brr= new int[9];
		for(int i=0;i<9;++i) {
			brr[i]=arr[i]+arr2[i];
		}
		return brr;
	}
	
	public int[]multiply(int arr[], int arr2[]) {
		int[]brr= new int[9];
		for(int i=0;i<9;++i) {
			brr[i]=arr[i]*arr2[i];
		}
		return brr;
	}
	
	public boolean checkQuad(int arr[]) {
		int i = 8;
		boolean b = true;
		while(i>2 && arr[i] == 0) {
			--i;
		}
		if(i != 2) {
			b = false;
		}
		return b;
	}
	
	public double[]findRoots(int arr[]) {
		int a = arr[2];
		int b = arr[1];
		int c = arr[0];
		int x = b*b - 4*a*c;
		double root[] = new double[2];
		root[0] = (-b + Math.sqrt(x))/ 4*a;
		root[1] = (-b - Math.sqrt(x))/ 4*a;
		return root;
	}
	
	public boolean equal(int arr[], int brr[]) {
		boolean b = true;
		for(int i=0;i<9;++i) {
			if(arr[i] != brr[i]) {
				b = false;
				break;
			}
		}
		return b;
	}
}
