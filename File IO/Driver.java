package practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Driver {
	public static void main(String[]args) throws IOException, FileNotFoundException {
		
		File file = new File("/home/examuser/input.txt");
		Scanner sc = new Scanner(file);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		int p4 = sc.nextInt();
		int d = (p1 - p3) * (p1 - p3);
		int d2 = (p2 - p4)  * (p2 - p4);
		double ans = Math.sqrt(d + d2);
		File file2 = new File("/home/examuser/output.txt");
		FileWriter fw = new FileWriter(file2);
		String s = Double.toString(ans);
		fw.write(s);
		fw.close();
	}
}
