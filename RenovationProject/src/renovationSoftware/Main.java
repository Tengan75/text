
package renovationSoftware;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static String betontipusa = "";
	static int szobahossza;
	static int szobaszeles;
	static int betonvastagsag;
	static int zsakSulya;
	static int betonEgysegar;
	static int padloM2;
	static double betonTeljesAr;

	static int falakTeruleteOssz;
	static int gurigaAra;
	static double gurigaMeret;
	static double gurigaOsszMennyiseg;
	static double gurigaTeljesAr;
	static String tapetaFajtaja;

	static final double vinylRagaszto = 25;
	static final double vliesRagaszto = 25;
	static double ragasztoAra;
	static double ragasztoTeljesAra;

	static int padloszonyegEgysegara;
	static int padloszonyegTeljesAra;

	static double teljesKoltseg;
	static double euro;
	static int nyelv;

	static double afaKulcs;

	public static void main(String[] args) {
		nyelvValasztas();
		betonTipusa(nyelv);
		szobaHossz(nyelv);
		szobaSzeles(nyelv);
		betonVastagsag(nyelv);
		zsakSulya(nyelv);
		padloM2();
		betonEgysegAr(nyelv);
		betonTeljesAr();
		tapetaFajtaja(nyelv);
		falakTeruletenekKiszamolasa(nyelv);
		gurigaAra(nyelv);
		gurigaMeret(nyelv);
		gurigaOsszMennyisegSzamolas();
		gurigaTeljesArszamolas();
		ragasztoAraKiszamolasa(nyelv);
		padloszonyegEgysegara(nyelv);
		padloszonyegTeljesara();
		teljesKoltseg(nyelv);
		atszamitasEuroba(nyelv);
		afaKulcs(nyelv);
		if (nyelv == 1) {
			printBreak();
			System.out.println("Betonozni kívánt terület: " + padloM2 + " négyzetméter");
			System.out.println("Beton típusa: " + betontipusa);
			System.out.println("Egy zsák súlya: " + zsakSulya + "kg");
			System.out.println("A szükséges beton mennyiség: " + padloM3() + " köbméter.");
			System.out.println("Szükséges zsák mennyiség: " + szuksegesDbZsak());
			System.out.println("A beton teljes ára áfa nélkül: " + Math.ceil(betonTeljesAr * afaKulcs) + "Ft");
			System.out.println("A beton teljes ára: " + betonTeljesAr + "Ft");
			printBreak();
			System.out.println("A tapéta fajtája: " + tapetaFajtaja);
			System.out.println("Szükséges gurigák mennyisége: " + gurigaOsszMennyiseg + "db");
			System.out.println("Egy guriga ára áfa nélkül: " + Math.ceil(gurigaAra * afaKulcs) + "Ft");
			System.out.println("Egy guriga ára: " + gurigaAra + "Ft");
			System.out.println("Gurigák teljes ára áfa nélkül: " + Math.ceil(gurigaTeljesAr * afaKulcs) + "Ft");
			System.out.println("Gurigák teljes ára: " + gurigaTeljesAr + "Ft");
			printBreak();
			System.out.println("Ragasztó egységára áfa nélkül: " + ragasztoAra * afaKulcs + "Ft");
			System.out.println("Ragasztó egységára: " + ragasztoAra + "Ft");
			System.out.println("Ragasztó ára összesen áfa nélkül: " + Math.ceil(ragasztoTeljesAra * afaKulcs) + "Ft");
			System.out.println("Ragasztó ára összesen: " + ragasztoTeljesAra + "Ft");
			printBreak();
			System.out.println("Padlószőnyegezni kívánt terület: " + padloM2 + " négyzetméter");
			System.out.println("Padlószőnyeg egységára áfa nélkül: " + Math.ceil(padloszonyegEgysegara * afaKulcs) + "Ft");
			System.out.println("Padlószőnyeg egységára: " + padloszonyegEgysegara + "Ft");
			System.out.println("Padlószőnyeg teljes ára áfa nélkül: " + Math.ceil(padloszonyegTeljesAra * afaKulcs) + "Ft");
			System.out.println("Padlószőnyeg teljes ára: " + padloszonyegTeljesAra + "Ft");
			printBreak();
			System.out.println("Teljes ár forintban: " + teljesKoltseg + "Ft");
			System.out.println("Teljes ár Euróban: " + Math.ceil(euro) + "€");
			printBreak();
		}
		if (nyelv == 2) {
			printBreak();
			System.out.println("Area of concrete: " + padloM2 + " squaremeter");
			System.out.println("Type concrete: " + betontipusa);
			System.out.println("Weight of one bag: " + zsakSulya + "kg");
			System.out.println("Total amout of concrete: " + padloM3() + " cubemeter.");
			System.out.println("Amout of bags: " + szuksegesDbZsak());
			System.out.println("Total price of concrete without tax: " + Math.ceil(betonTeljesAr * afaKulcs) + "Ft");
			System.out.println("Total price of concrete with tax: " + betonTeljesAr + "Ft");
			printBreak();
			System.out.println("Type of wallpaper: " + tapetaFajtaja);
			System.out.println("Total amout of rolls: " + gurigaOsszMennyiseg);
			System.out.println("Price of a roll without tax: " + Math.ceil(gurigaAra * afaKulcs) + "Ft");
			System.out.println("Price of a roll with tax: " + gurigaAra + "Ft");
			System.out.println("Total price of roll(s) without tax: " + Math.ceil(gurigaTeljesAr * afaKulcs) + "Ft");
			System.out.println("Total price of roll(s) with tax: " + gurigaTeljesAr + "Ft");
			printBreak();
			System.out.println("Price of glue per piece without tax: " + ragasztoAra * afaKulcs + "Ft");
			System.out.println("Price of glue with tax per piece: " + ragasztoAra + "Ft");
			System.out.println("Total price of glue without tax: " + Math.ceil(ragasztoTeljesAra * afaKulcs) + "Ft");
			System.out.println("Total price of glue with tax: " + ragasztoTeljesAra + "Ft");
			printBreak();
			System.out.println("Area of floor mats: " + padloM2 + " sqaremeter");
			System.out.println("Price of floor mats per squaremeter without tax: " + Math.ceil(padloszonyegEgysegara * afaKulcs) + "Ft");
			System.out.println("Price of floor mats  per squaremeter with tax: " + padloszonyegEgysegara + "Ft");
			System.out.println("Total price of floor mats without tax: " + Math.ceil(padloszonyegTeljesAra * afaKulcs) + "Ft");
			System.out.println("Total price of floor mats with tax: " + padloszonyegTeljesAra + "Ft");
			printBreak();
			System.out.println("Total price in HUF: " + teljesKoltseg + "Ft");
			System.out.println("Total price in Euro: " + Math.ceil(euro) + "€");
			printBreak();
		}

		scan.close();

	}

	public static void nyelvValasztas() {
		System.out.println("Válaszd ki a nyelvet: Magyar (1-es gomb) / Angol (2-es gomb).");
		System.out.println("Please choose a language: Hungary (Button 1) / English (Button 2).");
		int x = scan.nextInt();
		switch (x) {
		case 1:
			nyelv = 1;
			break;
		case 2:
			nyelv = 2;
			break;
		default:
			nyelv = 5;
			break;
		}
	}

	public static void betonTipusa(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a beton típusát!");
		}
		if (nyelv == 2) {
			System.out.println("Write the type of concrete:");
		}
		betontipusa = scan.next();
	}

	public static void szobaHossz(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a szoba hosszát cm-ben!");
		}
		if (nyelv == 2) {
			System.out.println("Write the length of the room:");
		}
		szobahossza = scan.nextInt();

	}

	public static void szobaSzeles(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a szoba szélességét cm-ben!");
		}
		if (nyelv == 2) {
			System.out.println("Write the width of the room:");
		}
		szobaszeles = scan.nextInt();
	}

	public static void betonVastagsag(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a kívánt beton vastagságát mm-ben!");
		}
		if (nyelv == 2) {
			System.out.println("Write the thickness of concrete:");
		}
		betonvastagsag = scan.nextInt();
	}

	public static void zsakSulya(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg egy zsák beton súlyát, kg-ban!");
		}
		if (nyelv == 2) {
			System.out.println("Write the weight of a bag of concrete (in kg):");
		}
		zsakSulya = scan.nextInt();
	}

	public static void padloM2() {
		padloM2 = (szobahossza * szobaszeles / 10_000);

	}

	public static double padloM3() {
		return ((double) szobahossza * szobaszeles * betonvastagsag / 1_000_000);
	}

	public static double szuksegesDbZsak() {
		int betonsulyaPerM2 = 2;
		double zsákDb = (padloM2 * betonvastagsag) / betonsulyaPerM2 / zsakSulya;
		return Math.ceil(zsákDb * 1.1);

	}

	public static void betonEgysegAr(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg egy zsák beton árát!");
		}
		if (nyelv == 2) {
			System.out.println("Write the price of a bag of concrete:");
		}
		betonEgysegar = scan.nextInt();

	}

	public static void betonTeljesAr() {
		betonTeljesAr = szuksegesDbZsak() * betonEgysegar;

	}

	// TODO: BEOLVASÁSI HIBA
	public static void tapetaFajtaja(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a tapéta fajtáját!");
		}
		if (nyelv == 2) {
			System.out.println("Write type of the wallpaper:");
		}
		tapetaFajtaja = scan.next();
	}

	public static int[] falakSzama(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a falak számát!");
		}
		if (nyelv == 2) {
			System.out.println("Write the number of walls:");
		}
		int[] falakTerulete = new int[scan.nextInt()];
		return falakTerulete;
	}

	public static void falakTeruletenekKiszamolasa(int nyelv) {
		int[] falakTerulete = falakSzama(nyelv);
		if (nyelv == 1) {
			System.out.println("Add meg a falak területét!");
		}
		if (nyelv == 2) {
			System.out.println("Write the area of walls: ");
		}
		for (int i = 0; i < falakTerulete.length; i++) {
			falakTerulete[i] = scan.nextInt();
		}
		for (int i = 0; i < falakTerulete.length; i++) {
			falakTeruleteOssz += falakTerulete[i];
		}

	}

	private static void gurigaMeret(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a guriga szélességét centiben!");
		}
		if (nyelv == 2) {
			System.out.println("Write the width of the roll(s) (in centimeters):");
		}
		double gurigaSzelessege = scan.nextDouble();
		if (nyelv == 1) {
			System.out.println("Add meg a guriga hosszát centiben!");
		}
		if (nyelv == 2) {
			System.out.println("Write the length of the roll(s) (in centimeters):");
		}
		double gurigaHossza = scan.nextDouble();
		gurigaMeret = (gurigaSzelessege * gurigaHossza) / 10_000;
	}

	public static void gurigaAra(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg egy guriga árát!");
		}
		if (nyelv == 2) {
			System.out.println("Write the price of a roll (in HUF):");
		}
		gurigaAra = scan.nextInt();
	}

	public static void gurigaOsszMennyisegSzamolas() {
		double gurigameny = falakTeruleteOssz / gurigaMeret;
		gurigaOsszMennyiseg = Math.ceil(gurigameny * 1.1);
	}

	public static void gurigaTeljesArszamolas() {
		double gurigameny = falakTeruleteOssz / gurigaMeret;
		gurigaTeljesAr = Math.ceil(gurigameny) * gurigaAra;
	}

	public static int ragasztoTipus(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Választ ki a ragasztó típusát az aláddi 2 közül vagy a 3-as opciót:  \r\n 1-es gomb: Tapétaragasztó vinyl, papír (25m2) \r\n 2-es gomb: Tapétaragasztó vlies (25m2) \r\n 3-as gomb: Nem veszek ragasztót");
		}
		if (nyelv == 2) {
			System.out.println("Choose the type of glue from the two below: \r\n Button 1: Vinyl for paper (25 sqaremeter) \r\n Button 2: Vlies (25 sqaremeter) \r\n Button 3: Dont buy glue.");
		}

		int ragasztotípus = scan.nextInt();
		return ragasztotípus;

	}

	public static double ragasztoMennyisege(int nyelv) {

		double ragasztoMennyisege = 0;
		switch (ragasztoTipus(nyelv)) {
		case 1:
			ragasztoMennyisege = falakTeruleteOssz / vinylRagaszto;
			break;
		case 2:
			ragasztoMennyisege = falakTeruleteOssz / vliesRagaszto;
			break;
		case 3:
			break;
		default:
			if (nyelv == 1) {
				System.out.println("Helytelen szám.");
			}
			if (nyelv == 2) {
				System.out.println("Wrong number.");
			}
			break;
		}
		return Math.ceil(ragasztoMennyisege * 1.1);
	}

	public static double ragasztoegysegAra(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a ragasztó egységárát!");
		}
		if (nyelv == 2) {
			System.out.println("Write the price of the glue:");
		}
		ragasztoAra = scan.nextInt();
		return ragasztoAra;

	}

	public static void ragasztoAraKiszamolasa(int nyelv) {
		ragasztoTeljesAra = ragasztoMennyisege(nyelv) * ragasztoegysegAra(nyelv);
	}

	public static void padloszonyegEgysegara(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg a padlószőnyeg négyzetméterenkénti árát!");
		}
		if (nyelv == 2) {
			System.out.println("Write the price of floor mats in squaremeters in HUF:");
		}
		padloszonyegEgysegara = scan.nextInt();
	}

	public static void padloszonyegTeljesara() {
		padloszonyegTeljesAra = padloszonyegEgysegara * padloM2;
	}

	public static void teljesKoltseg(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Válazd ki, hogy szeretnél-e kedvezményt adni: \r\n 1-es: 10% \r\n 2-es: 15% \r\n Egyéb szám: nem.");
		}
		if (nyelv == 2) {
			System.out.println("Choose if you want to give a discount: \r\n Button 1: 10% \r\n Button 2: 15% \r\n Press anything else if not.");
		}
		int kedvezmenyTipusa = scan.nextInt();

		switch (kedvezmenyTipusa) {
		case 1:
			if (nyelv == 1) {
				System.out.println("10% kedvezmény.");
			}
			if (nyelv == 2) {
				System.out.println("10% discount.");
			}
			teljesKoltseg = (padloszonyegTeljesAra + ragasztoTeljesAra + gurigaTeljesAr + betonTeljesAr) * 0.9;
			break;
		case 2:
			if (nyelv == 1) {
				System.out.println("15% kedvezmény!");
			}
			if (nyelv == 2) {
				System.out.println("15% discount.");
			}
			teljesKoltseg = (padloszonyegTeljesAra + ragasztoTeljesAra + gurigaTeljesAr + betonTeljesAr) * 0.85;
			break;
		default:
			teljesKoltseg = (padloszonyegTeljesAra + ragasztoTeljesAra + gurigaTeljesAr + betonTeljesAr);
			break;
		}
	}

	public static void atszamitasEuroba(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Add meg az euró árfolyamát!");
		}
		if (nyelv == 2) {
			System.out.println("Write the exchange rate of Euro.");
		}
		euro = scan.nextInt();
		euro = teljesKoltseg / euro;
	}

	public static void afaKulcs(int nyelv) {
		if (nyelv == 1) {
			System.out.println("Válaszd ki az áfakulcsot: \r\n 1: 5% \r\n 2: 18% \r\n 3: 27%");
		}
		if (nyelv == 2) {
			System.out.println("Choose VAT rate: \r\n Button 1: 5% \r\n Button 2: 18% \r\n Button 3: 27%.");
		}
		int afa = scan.nextInt();
		switch (afa) {
		case 1:
			afaKulcs = 0.95;
			break;
		case 2:
			afaKulcs = 0.82;
			break;
		case 3:
			afaKulcs = 0.73;
			break;
		}
	}

	public static void printBreak() {
		System.out.println("---------------------------------------------");
	}
}
