import java.util.Scanner;

public class Code15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		System.out.println("Enter the string: ");
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		System.out.print("The duplicate values are: ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.print(str[i] + " ");
					break;
				}
			}
		}
	}
}