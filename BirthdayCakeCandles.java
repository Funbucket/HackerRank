import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int max_num = findMax(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max_num) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static int findMax(int[] arr) {
		int max_num = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (max_num < arr[i + 1]) {
				max_num = arr[i + 1];
			}
		}
		return max_num;
	}
}
