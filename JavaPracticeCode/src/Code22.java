import java.util.Scanner;

public class Code22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the String to comapre");
		String s2 = sc.nextLine();
		StringBuffer s3 = new StringBuffer(s2);

		if (s1.equals(s3.toString())) {
			System.out.println("The two strings are equal");
		} else {
			System.out.println("The two strings are not equal");
		}
	}
}