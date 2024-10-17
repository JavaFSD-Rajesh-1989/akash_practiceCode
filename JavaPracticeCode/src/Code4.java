import java.util.Scanner;

public class Code4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int num = sc.nextInt();
		int reverse = 0;
		int num1 = num;
		do {

			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		} while (num != 0);
		System.out.println(reverse);
		if (reverse == num1) {
			System.out.println("It is palindrome");
		} else {

			System.out.println("It is not palindrome");

		}
	}
}
