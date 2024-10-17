import java.util.Scanner;

public class Code13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < ar.length; i++) {

			ar[i] = sc.nextInt();
		}
		System.out.println("Enter the number to check: ");
		int num = sc.nextInt();
		boolean containnum = false;
		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {
				containnum = true;
				break;
			}
		}
		if (containnum) {
			System.out.print("The array contains the number: " + num);
		} else {
			System.out.print("The array does not contains the number: " +

					num);

		}
	}
}