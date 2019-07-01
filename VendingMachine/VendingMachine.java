public class VendingMachine {
	static int tea, coffee, milk, sugar;
	static final int ctpowder = 5;
	static final int milkpowder = 25;
	static final int sugarneeded = 10;
	private static int teaNumber, coffeeNumber, milkNumber, sugarNumber, orders, teaOrders, coffeeOrders, milkOrders;
	
	public VendingMachine() {
		tea = coffee = milk = sugar = 0;
		teaNumber = coffeeNumber = milkNumber = sugarNumber = orders = teaOrders = coffeeOrders = 0;
	}
	
	public VendingMachine(int t, int c, int m, int s){
		tea = t;
		coffee = c;
		milk = m;
		sugar = s;
		teaNumber = coffeeNumber = milkNumber = sugarNumber = orders = teaOrders = coffeeOrders = 0;
	}
	
	public void checkMaterial(String s) {
		if(s.equals("tea")) {
			if(tea >= 5)
				;
			else
				fillTea();
		} else if (s.equals("coffee")){
			if(coffee >= 5)
				;
			else
				fillCoffee();
		} 
		
		if (milk >= 25)
			;
		else 
			fillMilk();
		
		if (sugar >= 10)
			;
		else fillSugar();
		
		orderTeaorCoffee(s);
	}
	
	public void orderTeaorCoffee(String s) {
		if(s.equals("tea")) {
			++teaOrders;
			tea -= 5;
		} else if (s.equals("coffee")){
			coffee -= 5;
			++coffeeOrders;
		} else
			++milkOrders;
		milk -= 25;
		sugar -= 10;
		++orders;
	}
	
	public void fillTea() {
		++teaNumber;
		tea += 100;
	}
	
	public void fillCoffee() {
		++coffeeNumber;
		coffee += 100;
	}
	
	public void fillMilk() {
		++milkNumber;
		milk += 500;
	}
	
	public void fillSugar() {
		++sugarNumber;
		sugar += 200;
	}
	
	public void printData() {
		System.out.println("Total number of orders: " + orders);
		System.out.println("Number of tea cups ordered: " + teaOrders);
		System.out.println("Number of coffee cups ordered: " + coffeeOrders);
		System.out.println("Number of milk cups ordered: " + milkOrders);
		System.out.println("Number of tea refills: " + teaNumber);
		System.out.println("Number of coffee refills: " + coffeeNumber);
		System.out.println("Number of milk refills: " + milkNumber);
		System.out.println("Number of sugar refills: " + sugarNumber);
	}
	
}
