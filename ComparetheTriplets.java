import java.util.Scanner;

public class ComparetheTriplets {

	public static void main(String[] args) {

		int[] alice = new int[3];
		int[] bob = new int[3];
		int alice_score = 0;
		int bob_score = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			int num = scan.nextInt();
			alice[i] = num;
		}
		for (int i = 0; i < 3; i++) {
			int num = scan.nextInt();
			bob[i] = num;
		}

		for (int i = 0; i < 3; i++) {
			if (alice[i] > bob[i]) {
				alice_score += 1;
			} else if (alice[i] < bob[i]) {
				bob_score += 1;
			}
		}
		System.out.printf("%d %d", alice_score, bob_score);

	}
}
