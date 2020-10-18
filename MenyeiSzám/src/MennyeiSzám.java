import java.util.Scanner;

public class MennyeiSzám {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kérem adja meg a számot!");
		long m = scanner.nextLong();
		boolean smallerThan100AndEvenNumber = (m < 100) && (m % 2 == 0);
		boolean greaterThan300AndDivisibleBy13 = (m > 300) && (m % 13 == 0);

		if (smallerThan100AndEvenNumber || greaterThan300AndDivisibleBy13) {
			System.out.println(" A Szám: " + m + " mennyeiszám. ");
		} else {
			System.out.println(" A Szám: " + m + " nem mennyeiszám. ");
		}
		scanner.close();
	}

}
