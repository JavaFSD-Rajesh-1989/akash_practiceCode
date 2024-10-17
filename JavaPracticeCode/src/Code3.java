import java.util.Scanner;

public class Code3 {
	public static void main(String[] args) {
//program to find Armstrong numbers between 1 to n
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for (int i = num1; i < num2; i++) {
			int sum = 0;
			int num3 = i;
			while (num3 != 0) {
				int dig = num3 % 10;
				sum += dig * dig * dig;
				num3 /= 10;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}