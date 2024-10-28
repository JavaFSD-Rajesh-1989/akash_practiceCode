import java.util.Scanner;

public class PangramString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a sentence to check if it's a pangram:");
		String sentence = scanner.nextLine();

		if (isPangram(sentence)) {
			System.out.println("The given sentence is a pangram.");
		} else {
			System.out.println("The given sentence is not a pangram.");
		}

		scanner.close();
	}

	public static boolean isPangram(String sentence) {
		if (sentence == null) {
			return false;
		}

		boolean[] alphabet = new boolean[26];
		int index = 0;

		sentence = sentence.toLowerCase();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				index = ch - 'a';
				alphabet[index] = true;
			}
		}

		for (boolean letter : alphabet) {
			if (!letter) {
				return false;
			}
		}

		return true;
	}
}
