import java.util.Scanner;

public class ConsonantVowelSpecial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		countConsonantVowelSpecial(string);
	}
	
	public static void countConsonantVowelSpecial(String string) {
		int vc=0, cc=0, sc=0;
		
		for(int i=0; i<string.length(); i++) {
			char ch = string.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					vc++;
				}else {
					cc++;
				}
			}else if(!(ch>='0' && ch<='9'||ch==' ')){
				sc++;
			}
		}
		System.out.println("Vowel: "+vc);
		System.out.println("Consonant: "+ cc);
		System.out.println("Special: "+ sc);
	}
}
