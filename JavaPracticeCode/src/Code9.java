import java.util.Scanner;

public class Code9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		float average = (float) sum / n;
		System.out.println("The sum is: " + sum);
		System.out.println("The average is :" + average);
	}
}