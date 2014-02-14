package C1_Schleifen;

import java.util.Scanner;

public class BeispielForSchleife {

    public static void main(String[] args) {

        /**
         * Kopfgesteuerte Z�hlschleife (R�ckw�rtsz�hlen)
         * Sie wird verwendet, wenn die Anzahl der Wiederholgungen
         * bekannt ist. 
         * Startwert i=100 
         * Abbruchbedingung: solange  i>=1 wahr ist, wird gez�hlt
         * Schrittweite: i wird bei jeder Wiederholung um 1 erniedrigt.
         */
        for (int i = 100; i >= 1; i = i - 1) {
            System.out.println("Countdown:" + i);
        }
        
        /**
         * Kopfgesteuerte Z�hlschleife (Vorw�rtsz�hlen)
         * Sie wird verwendet, wenn die Anzahl der Wiederholgungen
         * bekannt ist. 
         * Startwert i=0 
         * Abbruchbedingung: solange  i<=100 wahr ist, wird gez�hlt
         * Schrittweite: i wird bei jeder Wiederholung um 2 erh�htt.
         */
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println("Anzahl:" + i);
        }

        
    }

}
