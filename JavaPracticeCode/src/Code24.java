import java.util.Scanner;

public class Code24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the position of string to print: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 >= 0 && n2 <= s1.length() && n1 <= n2) {
			String s2 = s1.substring(n1, n2);
			System.out.println("The subString is: " + s2);
		} else {
			System.out.println("Invalid");
		}
	}
}