import java.util.Scanner;

public class NumericInEnd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		moveNumber(input);
	}
	public static void moveNumber(String input) {
		String xString = "";
		String yString = "";
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
				xString += ch;
			}else if(ch>=0 || ch<=9){
				yString += ch;
			}
		}
		
		String modifier = xString + yString ;
		System.out.println(modifier);
	}
}
