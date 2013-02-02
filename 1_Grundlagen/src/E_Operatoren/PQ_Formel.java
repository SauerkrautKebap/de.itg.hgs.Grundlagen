package E_Operatoren;

public class PQ_Formel {
	
	public static void main	(String[] argv){
		
		//Komandozeilenparameter �berpr�fen und ggf. a,b,c definieren
		if (argv.length!=3)	System.out.println("Bitte die Koeffizienten (a, b, c) des Polynoms angeben");
		else {
			double a= Double.parseDouble(argv[0]);
			double b= Double.parseDouble(argv[1]);
			double c= Double.parseDouble(argv[2]);
			/** Wenn der erste Koeffizient a=0 handelt es sich nicht mehr um ein Polynom zweiten Grades*/
			if (a!=0) pq(a,b,c); //berechnung
			else {
				/** Wenn die ersten beiden Koeefizienten Null sind handelt es sich um ein Polynom nullten Grades*/
				if (b!=0) System. out.println("Es handelt sich nicht um ein Polynom zweiten Grades! \nDie Nullstele des eingegeben Polynoms ist: \n x=" + ((-1)*c/b)); //Berechnung Inclusive
				else {
					if (c!=0) System. out.println("Es handelt sich nicht um ein Polynom zweiten Grades! \nDieses Polynom nullten Grades besitzt keine Nullstelle!"); //Berechnung an dieser Stelle w�re mathematisch bl�d
					else System. out.println("Es handelt sich nicht um ein Polynom zweiten Grades! \nDieses Polynom ist das Nullpolynom"); //hier auch
				}
			}
		}
	}
	/** Nullstellenberechnung f�r ein Polynom zweiten Grades*/
	public static void pq (double a, double b, double c){
		double minuspHalbe =(-1)*b*0.5/a;
		double diskriminante = minuspHalbe*minuspHalbe - c/a;
		if (diskriminante>0) System.out.println("Dieses Polynom besitzt zwei Nullstellen: \n x1=" + (minuspHalbe-Math.sqrt(diskriminante)) + "\n x2=" + (minuspHalbe+Math.sqrt(diskriminante)));
		else {
			if (diskriminante<0) System.out.println("Dieses Polynom hat keine Nullstellen im reellen Zahlenraum"); //Die Wurzel aus Negativen in R nicht m�glich
			else System.out.println("Dieses Polynom besitzt nur eine Nullstelle: \n x=" + minuspHalbe);	//Ausnahmefall, wenn die Wurzel null ist
		}
	
	}
}

/*

Z:\java\�bungen\Pino.java> java PQ_Formel 4 6 9
Dieses Polynom hat keine Nullstellen im reellen Zahlenraum

Z:\java\�bungen\Pino.java> java PQ_Formel 4 -16 16
Dieses Polynom biestzt nur eine Nullstelle:
 x=2.0

Z:\java\�bungen\Pino.java> java PQ_Formel 4 -16 4
Dieses Polynom besitzt zwei Nullstellen:
 x1=0.2679491924311228
 x2=3.732050807568877

Z:\java\�bungen\Pino.java> java PQ_Formel 4 -16 0
Dieses Polynom besitzt zwei Nullstellen:
 x1=0.0
 x2=4.0

Z:\java\�bungen\Pino.java> java PQ_Formel 0 -16 0
Es handelt sich nicht um ein Polynom zweiten Grades!
Die Nullstele des eingegeben Polynoms ist:
 x=0.0
*/
