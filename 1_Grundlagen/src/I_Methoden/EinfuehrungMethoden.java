package I_Methoden;
public class EinfuehrungMethoden {
	// Hauptprogramm 
	// Nach der Ausgabe wird jede Methode einmal aufgerufen
	public static void main(String[] args) {
		System.out.println("Hallo hier bin ich");
		zeichneLinie();
		zeichneLinie(80);
		zeichneLinie(80, '*');
	}

	// Einfache Methode, ohne R�ckgabewert
	public static void zeichneLinie() {
		System.out.println("-------------------------");
	}

	// Einfache �berladene Methode mit �bergabeparameter
	// ohne R�ckgabewert
	// Zeichnet eine Linie definierter L�nge
	public static void zeichneLinie(int anzahlStriche) {
		for (int i = 0; i < anzahlStriche; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	// Einfache �berladene Methode mit mehreren �bergabeparametern
	// ohne R�ckgabewert
	// Zeichnet eine Linie definierter L�nge mit einem definierten Zeichen
	public static void zeichneLinie(int anzahlStriche, char zeichen) {
		for (int i = 0; i < anzahlStriche; i++) {
			System.out.print(zeichen);
		}
		System.out.println();
	}
}
