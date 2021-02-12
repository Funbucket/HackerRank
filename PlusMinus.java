import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		double positive_count = 0;
		double negative_count = 0;
		double zero_count = 0;

		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			arr[i] = num;
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				negative_count += 1;
			} else if (arr[i] > 0) {
				positive_count += 1;
			} else {
				zero_count += 1;
			}
		}
		System.out.printf("%.6f\n%.6f\n%.6f", positive_count / arr.length, negative_count / arr.length,
				zero_count / arr.length);
	}

}
