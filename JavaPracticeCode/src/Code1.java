import java.util.Scanner;

public class Code1 {
	public static void main(String[] args) {
// print numbers in the reverse order using for, while and do while
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int reverse = 0;
//while loop:
		/*
		 * while (num != 0) { int digit = num % 10; reverse = reverse * 10 + digit; num
		 * /= 10; } System.out.println("Reversed number: " + reverse);
		 */
//do while
		/*
		 * do { int digit = num % 10; reverse = reverse * 10 + digit; num/=10;
		 * 
		 * } while(num!=0); System.out.println("Reversed number: " + reverse);
		 */
//for loop
		for (; num != 0; num /= 10) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
		}
		System.out.println("Reversed number: " + reverse);
	}
}