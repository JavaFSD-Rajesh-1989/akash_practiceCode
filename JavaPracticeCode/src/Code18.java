import java.util.Arrays;
import java.util.Scanner;

public class Code18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		int[] ar1 = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.arraycopy(ar, 0, ar1, 0, n);
		System.out.println("Original array: " + Arrays.toString(ar));
		System.out.println("Copy array: " + Arrays.toString(ar1));
	}
}