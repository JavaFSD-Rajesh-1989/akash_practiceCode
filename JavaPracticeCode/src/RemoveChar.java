import java.util.Scanner;

public class RemoveChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String str1 = sc.nextLine();

		System.out.println("Enter the character to remove: ");
		char ch1 = sc.next().charAt(0);

		StringBuilder str2 = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			char ch2 = str1.charAt(i);
			if (ch2 != ch1) {
				str2.append(ch2);
			}
		}
		System.out.println("The string is: " + str2);
	}
}
