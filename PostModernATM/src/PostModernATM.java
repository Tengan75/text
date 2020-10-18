import java.util.Arrays;
import java.util.Scanner;

public class PostModernATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int moneyAmount;
		do {
			System.out.println("Adja meg a pénzöszeget: ");
			moneyAmount = scanner.nextInt();
			System.out.println("A megadott pénzösszeg " + moneyAmount);
			if (moneyAmount < 0 ) {
				System.out.println("negatív pénzösszeget nem adható meg!");
			}
			if (moneyAmount % 5 != 0) {
				System.out.println("A megadott pénzösszeg nem fizethetö meg, mert nem osztható 5-ttel");
			}
		} while (moneyAmount < 0 || moneyAmount % 5 != 0);

		int[] currencies = { 20_000, 10_000, 5_000, 2_000, 1_000, 500, 200, 100, 50, 20, 10, 5 };
		int remainingAmount = moneyAmount;
		int piecies[] = new int[currencies.length];
		for (int i = 0; i < currencies.length; i++) {
			piecies[i] = remainingAmount / currencies[i];
			remainingAmount = remainingAmount % currencies[i];
		}
		// System.out.println(Arrays.toString(piecies));
		for (int i = 0; i < currencies.length; i++) {
			System.out.println(currencies[i] + ": " + piecies[i] + "db");
		}
		scanner.close();
	}
}
