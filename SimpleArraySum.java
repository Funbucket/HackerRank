import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i =0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int total = 0;
		for (int i =0; i<n; i++) {
			total += arr[i];
		}
		System.out.printf("%d", total);
		
	}

}
