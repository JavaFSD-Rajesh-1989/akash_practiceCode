import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Code16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array1: ");
		int n1 = sc.nextInt();
		int[] ar1 = new int[n1];
		System.out.println("Enter the number: ");
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of array2: ");
		int n2 = sc.nextInt();
		int[] ar2 = new int[n2];
		System.out.println("Enter the String: ");
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = sc.nextInt();
		}
		List<Integer> common = new ArrayList<>();
		Arrays.sort(ar1);
		Arrays.sort(ar2);

		int index1 = 0;
		int index2 = 0;
		while (index1 < n1 && index2 < n2) {
			if (ar1[index1] == (ar2[index2])) {
				common.add(ar1[index1]);
				index1++;
				index2++;

			} else if (ar1[index1] < (ar2[index2])) {
				index1++;
			} else {
				index2++;
			}
		}
		if (!common.isEmpty()) {
			System.out.println("Common elements between the arrays: " + common);
		} else {
			System.out.println("No common elements between the arrays.");
		}
	}
}