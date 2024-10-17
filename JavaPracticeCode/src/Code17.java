import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Code17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array1: ");
		int n1 = sc.nextInt();

		String[] str1 = new String[n1];
		System.out.println("Enter the string: ");
		for (int i = 0; i < str1.length; i++) {
			str1[i] = sc.next();
		}
		System.out.print("Enter the size of array2: ");
		int n2 = sc.nextInt();
		String[] str2 = new String[n2];
		System.out.println("Enter the String: ");
		for (int i = 0; i < str2.length; i++) {
			str2[i] = sc.next();
		}
		List<String> common = new ArrayList<>();
		Arrays.sort(str1);
		Arrays.sort(str2);
		int index1 = 0;
		int index2 = 0;
		while (index1 < n1 && index2 < n2) {
			if (str1[index1].equals(str2[index2])) {
				common.add(str1[index1]);
				index1++;
				index2++;

			} else if (str1[index1].compareTo(str2[index2]) < 0) {
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