import java.util.Scanner;

public class DayoftheProgrammer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if (year == 1918) {
			System.out.println("26.09.1918");
		}
		else
			System.out.println(dayOf(year));
	}

	public static boolean leapYear(int year) {
		if (year < 1918) {
			if ((year % 4 == 0) || (year % 400 == 0))
				return true;
			else if (year % 100 == 0)
				return false;
			else
				return false;
		}

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			return true;
		else
			return false;
	}

	public static String dayOf(int year) {
		if (leapYear(year)) {
			return "12.09." + year;
		} else {
			return "13.09." + year;
		}
	}
}
