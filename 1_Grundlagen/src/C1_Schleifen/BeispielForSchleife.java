package C1_Schleifen;

import java.util.Scanner;

public class BeispielForSchleife {

    public static void main(String[] args) {

        /**
         * Kopfgesteuerte Zaehlschleife (Rueckwaertszaehlen)
         * Sie wird verwendet, wenn die Anzahl der Wiederholgungen
         * bekannt ist. 
         * Startwert i=100 
         * Abbruchbedingung: solange  i>=1 wahr ist, wird gezaehlt
         * Schrittweite: i wird bei jeder Wiederholung um 1 erniedrigt.
         */
    	
    	
       /* for (int zaehler = 100; zaehler >= 1; zaehler = zaehler - 1) {
            System.out.println("Countdown:" + zaehler);
        }*/
        
        /**
         * Kopfgesteuerte Z�hlschleife (Vorw�rtsz�hlen)
         * Sie wird verwendet, wenn die Anzahl der Wiederholgungen
         * bekannt ist. 
         * Startwert i=0 
         * Abbruchbedingung: solange  i<=100 wahr ist, wird gez�hlt
         * Schrittweite: i wird bei jeder Wiederholung um 2 erh�htt.
         */
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println("Anzahl:" + i);
        }
        
        
        
        System.out.println("Ende");
        
    }

}
