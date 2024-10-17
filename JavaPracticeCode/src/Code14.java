import java.util.Scanner;

public class Code14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
		System.out.print("The duplicates are: ");
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.print(ar[j] + " ");
					break;
				}
			}
		}
	}
}