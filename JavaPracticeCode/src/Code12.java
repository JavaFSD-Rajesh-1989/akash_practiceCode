import java.util.Scanner;

public class Code12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();

		int[] ar = new int[n];
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int max = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.println("The max is: " + max);
		int min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("The min is: " + min);
	}
}