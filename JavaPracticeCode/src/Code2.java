import java.util.Scanner;

public class Code2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		int count = 0;
		int i = num;
		while (i != 0) {
			int digit = i % 10;

			sum += digit;
			product *= digit;
			count++;
			i /= 10;

		}
		System.out.println("Sum of digits: " + sum);
		System.out.println("Product of digits: " + product);
		System.out.println("Number of digits: " + count);
		int lastDigit = num % 10;
		while (num >= 10) {
			num /= 10;
		}
		int firstDigit = num;
		System.out.println("Sum of first and last digit: " + (firstDigit + lastDigit));
	}
}