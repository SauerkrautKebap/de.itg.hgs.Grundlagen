package H_Arrays;

public class Himmelrichtungen {

	public static void main(String[] args) {
		
		//Array direkt initialisieren
		String[] himmelsrichtung = { "Nord", "S�d", "Ost", "West" };
				
		//Ausgabe des Arrays
		for (int i = 0; i < himmelsrichtung.length; i=i+1) {
			System.out.print(himmelsrichtung[i]+" ");
		}
		
		//�nderung
		himmelsrichtung[1] = "Sued";
		System.out.println();
		
		//Ausgabe des Arrays
		for (int i = 0; i < himmelsrichtung.length; i=i+1) {
			System.out.print(himmelsrichtung[i]+" ");
		}
		

	}

}
