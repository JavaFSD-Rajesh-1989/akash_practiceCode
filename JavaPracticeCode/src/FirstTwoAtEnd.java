import java.util.Scanner;

public class FirstTwoAtEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		boolean firstTwoAtEnd = false;

		if (str.length() >= 2) {
			String firstTwo = str.substring(0, 2);
			String endTwo = str.substring(str.length() - 2);
			firstTwoAtEnd = firstTwo.equals(endTwo);
		}

		System.out.println("The first two characters appear in the last is: " + firstTwoAtEnd);
	}
}
