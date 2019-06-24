public class Driver {

	public static void main(String[] args) {
		Polynomial P = new Polynomial();
		int brr[] = new int[9];
		P.get(brr);
		P.set(brr);
		Polynomial P2 = new Polynomial();
		P2.get(brr);
		P2.set(brr);
		Polynomial P3 = new Polynomial();
		System.out.println("Degree of first: " + P.degree(P.arr));
		System.out.println("Degree of second: " + P2.degree(P2.arr));
		brr = P3.add(P.arr, P2.arr);
		for(int i = 0;i<9;++i) {
			System.out.print(brr[i] + " ");
		}
		System.out.println("This was sum");
		brr = P3.multiply(P.arr, P2.arr);
		for(int i = 0;i<9;++i) {
			System.out.print(brr[i] + " ");
		}
		System.out.println("This was product");
		if (P.checkQuad(P.arr)) {
			double t[]=new double[2];
			t = P.findRoots(P.arr);
			System.out.println("Roots: "+ t[0] + "," + t[1]);
		} else 
			System.out.println("First is not quadratic");
		if (P2.checkQuad(P2.arr)) {
			double t[]=new double[2];
			t = P2.findRoots(P2.arr);
			System.out.println("Roots: "+ t[0] + "," + t[1]);
		} else 
			System.out.println("Second is not quadratic");
		if(P3.equal(P.arr, P2.arr)) {
			System.out.println("Equal");
		} else
			System.out.println("Not equal");
	}
}
