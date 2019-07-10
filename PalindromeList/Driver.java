import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Palin s1 = new Palin();
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to be checked");
		s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			s1.push(s.charAt(i));
		}
		for (int i = 0; i < s.length(); i++) {
			s1.reverse();
		}
		if (s.equals(s1.s)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It ain't palindrome");
		}

	}
}
