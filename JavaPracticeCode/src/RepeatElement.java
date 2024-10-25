import java.util.Scanner;

public class RepeatElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		long[] arr = new long[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextLong();
		}

		findRepeatedElements(arr);
	}

	public static void findRepeatedElements(long[] arr) {
		boolean found = false;
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				if (count > 1) {
					System.out.print(arr[i - 1] + " ");
					found = true;
				}
				count = 1;
			}
		}

		if (count > 1) {
			System.out.print(arr[arr.length - 1]);
			found = true;
		}

		if (!found) {
			System.out.println("-1");
		}
	}
}
