package java_20190617;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String temp = null;
		do {
			System.out.println("ÂÍ");
			temp = sn.next();
			System.out.println(temp);
		} while (!temp.equals("end"));

	}
}
