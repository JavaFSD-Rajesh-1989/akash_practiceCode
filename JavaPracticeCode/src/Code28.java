import java.util.Scanner;

public class Code28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the string or character to remove: ");
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			char ch3 = str1.charAt(i);
			if (ch3 != ch1 && ch3 != ch2) {
				str2.append(ch3);
			}
		}
		System.out.println("The string is: " + str2);
	}
}