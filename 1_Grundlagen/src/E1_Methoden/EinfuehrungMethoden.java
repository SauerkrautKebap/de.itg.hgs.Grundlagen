package E1_Methoden;

import A6_Operatoren.Zahlenschloss;

public class EinfuehrungMethoden {
	
	//main-Methode
	public static void main(String[] args) {
	    System.out.println("Start");
		
	    double zahl1 = getSum(0,0);
	
	    System.out.println(zahl1);
	
		System.out.println("Ende");
	}
	
	//Mit �bergabeparameter
		public static void zeichneLinie(int pZahl, String zeichen){
			for (int i = 0; i < pZahl; i++) {
				System.out.print(zeichen);
			}
			System.out.println();
		}
	
	
	
	//Mit �bergabeparameter
	public static void zeichneLinie(int pZahl){
		for (int i = 0; i < pZahl; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	
	
	
	//�berladene Methode ohne �bergabeparameter
	public static void zeichneLinie(){
		
			System.out.println("------------");
		
		
	}
	
	
	public static double getSum(double pZahl1, double pZahl2){
		//Eingabe und Initialisierung
		double returnValue;
		
		//verarbeitung
		returnValue = pZahl1+pZahl2;
		
		//R�ckgabe
		return returnValue; 
	}
	
	
	
	
}
