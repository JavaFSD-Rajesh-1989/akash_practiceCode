import java.util.Scanner;

public class Code8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		do {
			System.out.println("Enter the name:");
			name = sc.nextLine();
			if (!name.equalsIgnoreCase("END")) {
				System.out.println("Names are: " + name + " ");
			}
		} while (!name.equalsIgnoreCase("END"));
		System.out.println("Im done.");
	}
}