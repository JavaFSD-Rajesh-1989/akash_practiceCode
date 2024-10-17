import java.util.Scanner;

public class Code10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.print("Even numbers: ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				System.out.print(ar[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers: ");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 != 0) {
				System.out.print(ar[i] + " ");
			}
		}
	}
}