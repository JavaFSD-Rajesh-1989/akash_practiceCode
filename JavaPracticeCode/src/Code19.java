import java.util.Scanner;

public class Code19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter the number of column: ");
		int c = sc.nextInt();
		int[][] ar = new int[r][c];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("The array is: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
}