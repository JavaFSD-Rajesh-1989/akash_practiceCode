import java.util.Scanner;

public class Code21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the characters to compare: ");
		String s2 = sc.nextLine();
		if (s1.equals(s2)) {
			System.out.print("The two strings are equal");
		} else {
			System.out.print("The two strings are not equal");
		}
	}
}