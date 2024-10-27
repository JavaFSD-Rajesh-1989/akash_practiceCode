import java.util.Scanner;

public class SecondMostRepeatChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String:");
		String str = sc.nextLine();
		int i, max = 0, sec_max = 0;
		int arr[] = new int[256];
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				arr[str.charAt(i)]++;

			}
		}
		for (i = 0; i < 256; i++) {
			if (arr[i] > arr[max]) {
				sec_max = max;
				max = i;

			} else if (arr[i] > arr[sec_max] && arr[i] != arr[max]) {
				sec_max = i;
			}
		}
		System.out.print("The Second Most occurring character: " + (char) (sec_max));
	}

}
