import java.util.Scanner;

public class Code20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int c = sc.nextInt();
		int[][] mat1 = new int[r][c];
		int[][] mat2 = new int[r][c];
		int[][] sumMat = new int[r][c];
		System.out.println("Enter the first matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sumMat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.println("Result matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(sumMat[i][j] + " ");
			}
			System.out.println();
		}
	}
}