import java.util.Scanner;

public class Code27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the number of times to repeat: ");
		int n = sc.nextInt();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(str + "\n");
		}
		System.out.println(result);
	}
}