import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Rev s1 = new Rev();
		String s;
		System.out.println("Enter string to be reversed: ");
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		for (int i = 0; i < s.length(); i++) {
			s1.push(s.charAt(i));
		}
		for (int i = 0; i < s.length(); i++) {
			s1.reverse();
		}

	}
}
