import java.util.Scanner;

public class Code23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the word to replace: ");
		String s2 = sc.nextLine();
		System.out.println("Enter the word to replace with: ");
		String s3 = sc.nextLine();
		String s4 = s1.replaceAll(s3, s2);
		System.out.println("The final string is: " + s4);
	}
}