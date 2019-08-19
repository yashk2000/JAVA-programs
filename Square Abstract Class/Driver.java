package practise;

import java.util.Scanner;
public class Driver extends SquareTract{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side: ");
		int r = sc.nextInt();
		Driver D = new Driver();
		System.out.println(D.area(r));
		System.out.println(D.perimeter(r));
		System.out.println(D.volume(r));
		D.print(r);
	}
	
	@Override
	public int volume(int r) {
		return r * r * r;
	}
	
	@Override
	public int perimeter(int r) {
		return 4 * r;
	}
}
