import java.util.Scanner;

public class Code11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Enter the number to find index");
		int fnum = sc.nextInt();
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == fnum) {
				System.out.print("The index is: " + i);
			}
		}
	}
}