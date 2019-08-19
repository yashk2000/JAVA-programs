package practise;

import java.util.Scanner;
public class Driver implements CircleFace{
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r = sc.nextDouble();
		
		Driver D = new Driver();
		System.out.println(D.area(r));
		System.out.println(D.perimeter(r));
	}
	
	@Override
	public double area(double r) {
		return pi * r * r;
	}
	
	@Override
	public double perimeter(double r) {
		return 2 * pi * r;
	}
}
