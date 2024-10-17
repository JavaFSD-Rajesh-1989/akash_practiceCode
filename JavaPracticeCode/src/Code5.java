import java.util.Scanner;

public class Code5 {
	public static void main(String[] args) {
// find all factors of a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int i = 1;
		do {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= num);
	}
}