import java.util.Scanner;

public class CharStartsWith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");

		String str = sc.nextLine();
		System.out.println("Enter the string to check start with: ");
		String str2 = sc.nextLine();
		boolean startsWith = false;
		if (str.length() >= str2.length()) {
			startsWith = str.startsWith(str2, 0) || str.startsWith(str2, 1);
		}
		System.out.println("Does it start with " + str2 + " at index 0 or 1? " + startsWith);
	}
}
