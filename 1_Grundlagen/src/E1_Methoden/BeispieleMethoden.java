package E1_Methoden;

public class BeispieleMethoden {

	// Hauptmethode
	public static void main(String[] args) {

		zeichneLinie();
		System.out.println("Hammer");
		zeichneLinie();
		System.out.println("Nikolai");
		zeichneLinie("+");
		zeichneLinie("~", 20);

		double bmiWert = getBmi(78, 1.76);
		System.out.println("Bmi:"+bmiWert);
	}

	// Methode zum Zeichnen einer Linie
	public static void zeichneLinie() {
		System.out.println("------");
	}

	// �nerladene Methode mit �bergabeparameter zum Zeichnen einer Linie
	public static void zeichneLinie(String pZeichen) {
		for (int i = 0; i < 5; i++) {
			System.out.print(pZeichen);
		}
		System.out.println();

	}

	// �nerladene Methode mit �bergabeparameter zum Zeichnen einer Linie
	public static void zeichneLinie(String zeichen, int anzahl) {
		for (int i = 0; i < anzahl; i++) {
			System.out.print(zeichen);
		}
		System.out.println();

	}

	//Methode mit R�ckgabewert und �bergabeparameter f�r BMI
	public static double getBmi(double pMasseInKg, double pGroesseInMeter) {

		// Verarbeitung
		double bmi = pMasseInKg / (pGroesseInMeter * pGroesseInMeter);

		// R�ckgabe
		return bmi;
	}

}
