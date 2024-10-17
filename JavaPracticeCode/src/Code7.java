import java.util.Scanner;

public class Code7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		do {
			System.out.print("Enter a numbers: ");
			num = sc.nextInt();
			if (num >= 0) {
				sum += num;
			}
		} while (num >= 0);
		System.out.println("Sum: " + sum);
	}
}