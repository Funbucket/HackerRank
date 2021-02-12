import java.util.Scanner;

public class NumberLineJumps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double alocation = scan.nextInt();
		double ajump = scan.nextInt();
		double blocation = scan.nextInt();
		double bjump = scan.nextInt();

		double a_y = alocation - ajump;
		double b_y = blocation - bjump;
		double count = (b_y - a_y) / (ajump - bjump);

		if (test_int(count) == false) {
			System.out.println("NO");
		} else if (test_int(count) == true) {
			System.out.println("YES");
		}
	}

	public static boolean test_int(double count) {
		boolean result = false;
		if (count < 0) {
			return result;
		} else if ((count - (int) count) > 0 || (count - (int) count) < 0) {
			return result;
		} else {
			result = true;
			return result;
		}
	}

}
