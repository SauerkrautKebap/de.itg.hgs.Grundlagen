package A6_Operatoren;
/*
Einfache �bungen
zu Operatoren
*/

public class UebungOperatoren {

  public static void main(final String[] args) {
         //�bung 1:
         //Letzte Ziffer einer Zahl speichern und anschliessend
         //die letzte Ziffer der Zahl abtrennen
         
         int ZahlenCode = 12345;
         int letzteZiffer = ZahlenCode % 10;
         int neueZahl = ZahlenCode/10;
         System.out.println(letzteZiffer);
         System.out.println(neueZahl);
         
         //�bung 2:
         //Deklarieren Sie die Zahl 255 als Hexadezimalzahl
         //und geben Sie diese aus
         //Was stellen Sie fest?
         int hexadezimalZahl=0xff;
         System.out.println("\nDie Hexadezimalzahl:"+hexadezimalZahl);
         
         //�bung 3:
         //Reihenfolge der Auswertung in Ausdr�cken
         //Welchen Wert hat b?
         //Begr�nden Sie das Ergebnis.
         
         int a=10,b;
         b=a++ + ++a;
         System.out.println("\nb: " +b);
         
         //�bung 4:
         //Welchen Wert hat z4? Begr�nden Sie Ihr ergebnis.
         int a4=5;
         int b4=3;
         int z4;
         z4 = a4&b4;
         System.out.println("\nz4 "+z4);
         
         //�bung 5:
         //Welchen Wert hat z5? Begr�nden Sie Ihr ergebnis.
         int a5=11;
         int b5=9;
         int z5;
         
         z5=a5|b5;
         System.out.println("\nz5 "+z5);
         
         
         //�bung 6:
         //Welche Ergebnisse ergeben sich bei den Pr�fsummen 1-4?
         
         boolean pruefSumme1,pruefSumme2,pruefSumme3,pruefSumme4;
         int a6 = 9;
         int b6 = 99;
         pruefSumme1 = a6<10 && b6>10;
         pruefSumme2 = a6>10 && b6>10;
         pruefSumme3 = a6>10 && b6>10;
         pruefSumme4 = a6<10 && b6<10;
         System.out.println("\npr�fSumme1 "+pruefSumme1);
         System.out.println("pr�fSumme2 "+pruefSumme2);
         System.out.println("pr�fSumme3 "+pruefSumme3);
         System.out.println("pr�fSumme4 "+pruefSumme4);
         
         
         //�bung 7:
         //Anwenden mathematischer Methoden aus der Klasse Math.*
         double pi = Math.PI;

         double wi1 = Math.sin(pi);
         double wi2 = Math.sin(pi/2);
         double wi3 = Math.sin(pi/4);
         double wi4 = Math.cos(pi);
         double wi5 = Math.cos(pi/2);
         double wi6 = Math.cos(pi/4);

         System.out.println("\nwi1 "+ wi1);
         System.out.println("wi2 "+ wi2);
         System.out.println("wi3 "+ wi3);
         System.out.println("wi4 "+ wi4);
         System.out.println("wi5 "+ wi5);
         System.out.println("wi6 "+ wi6);
         
         
         //�bung 8: Schreiben Sie ein Programm zur Berechnung eines Winkels
         //aus einem Bogenmass
         
         

         
         
         
         
  }
}

