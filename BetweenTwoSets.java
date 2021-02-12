
import java.util.ArrayList;
import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] listA = new int[n];
		int[] listB = new int[m];

		for (int i = 0; i < n; i++) {
			listA[i] = scan.nextInt();
		}
		for (int i = 0; i < m; i++) {
			listB[i] = scan.nextInt();
		}

		int B_gcd = multiGcd(listB);
		int[] Bgcdfactors = factorOfGcd(B_gcd);
		int A_lcm = multiLcm(listA);
		int count = 0;
		if (A_lcm == 1) {
			System.out.println(Bgcdfactors.length + 1);
		} else {
			for (int i = 0; i < Bgcdfactors.length; i++) {

				if (Bgcdfactors[i] % A_lcm == 0)
					count++;
			}
			System.out.println(count);
		}

	}

	public static int[] factorOfGcd(int gcd) {
		ArrayList<Integer> nums = new ArrayList<Integer>();

		int num = 2;
		while (num <= gcd) {
			if (gcd % num == 0) {
				nums.add(num);
				num++;
			} else {
				num++;
			}
		}
		int[] factors = new int[nums.size()];
		for (int i = 0; i < factors.length; i++) {
			factors[i] = nums.get(i);
		}
		return factors;
	}

	public static int multiLcm(int[] arr) {
		int lcm1 = arr[0];
		for (int i = 0; i < arr.length; i++)
			lcm1 = lcm(lcm1, arr[i]);
		return lcm1;
	}

	public static int multiGcd(int[] arr) {
		int gcd1 = arr[0];
		for (int i = 0; i < arr.length; i++)
			gcd1 = gcd(gcd1, arr[i]);
		return gcd1;
	}

	private static int gcd(int n, int m) {
		if (m == 0)
			return n;
		return gcd(m, n % m);
	}

	private static int lcm(int n, int m) {
		return (n * m) / gcd(n, m);
	}

}
