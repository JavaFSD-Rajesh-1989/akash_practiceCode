import java.util.Scanner;

public class Code6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int num1 = 1, num2 = 1;
		int count = 0;
		while (count < num) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			count++;

		}
	}
}