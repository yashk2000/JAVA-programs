import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter :tea: for tea, :milk: for milk, :coffee: for coffee, -1 to exit. Default order is milk");
		VendingMachine vm = new VendingMachine(100, 100, 500, 200);
		String s = sc.nextLine();
		while(!s.equals("-1")) {
			vm.checkMaterial(s);
			System.out.println(s + " has been ordered");
			System.out.println();
			s = sc.nextLine();
		}
		sc.close();
		
		System.out.println();
		System.out.println("Day ended");
		System.out.println("Order summary for the day:" );
		vm.printData();
	}

}
