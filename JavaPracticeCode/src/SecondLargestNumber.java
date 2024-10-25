import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int result = secondLarge(arr);
		System.out.println(result);
	}
	
	public static int secondLarge(int[] arr) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i]>max2){
				max2 = arr[i];
			}
		}return max2;
	}
}
