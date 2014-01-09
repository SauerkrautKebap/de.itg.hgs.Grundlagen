package E1_Methoden;
public class EinfuehrungMethoden {
	// Hauptprogramm 
	// Nach der Ausgabe wird jede Methode einmal aufgerufen
	public static void main(String[] args) {
	    
	    //Erste Anweisung im Hauptprogramm
		System.out.println("Hallo hier bin ich");
		
		//Methoden aufrufen
		zeichneLinie();
		zeichneLinie(20);
		zeichneLinie(15,'x');
		
		//Nach bearbeitung der Methode
		//kehrt das PRogramm hierher zur�ck
		System.out.println("Ende");
	}//Ende main
	
	
	
	
	// Einfache Methode, ohne R�ckgabewert
	public static void zeichneLinie() {
		System.out.println("x-------------------------");
	}//Ende zeichneLinie()

	
	
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
