import java.util.Scanner;

public class HighestCommonFactor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		for(int i=n;i<=n;i--) {
			if(n%1==0 && m%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
}
