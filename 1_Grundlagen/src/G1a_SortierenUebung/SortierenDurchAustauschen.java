package G1a_SortierenUebung;

import javax.swing.plaf.FontUIResource;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SortierenDurchAustauschen {

    public static void main(String[] args) {
        // Unsortiertes Array initialisieren
        int[] unsortiert = { 5, 8, 111, 3, 60, 75, 99, 0, 8 };

        // Array f�r sortierte Zahlen erstellen
        int[] sortiert = new int[unsortiert.length];

        // Array sortieren
        sortiert = sortiereArrayDurchEinfuegen(unsortiert);

        // Sortiertes Array ausgeben
        ausgabeArray(unsortiert);
        ausgabeArray(sortiert);

    }

    private static void ausgabeArray(int[] sortiert) {
        for (int i = 0; i < sortiert.length; i++) {
            if (i < sortiert.length - 1) {
                System.out.print(sortiert[i] + ", ");
            } else {
                System.out.print(sortiert[i]);
            }
        }

        System.out.println("\n-----------------------------------");

    }

    private static int[] sortiereArrayDurchAustauschen(int[] pZahlen) {
        int merke;

        // Kopie erstellen
        int[] z = pZahlen.clone();

        for (int i = 0; i < z.length - 1; i++) {
            for (int k = i + 1; k < z.length; k++) {

                if (z[i] > z[k]) {
                    // tauschen
                    merke = z[i];
                    z[i] = z[k];
                    z[k] = merke;
                }
            }
        }

        return z;
    }

    private static int[] sortiereArrayDurchEinfuegen(int[] pZahlen) {
        // Kopie erstellen
        int[] z = pZahlen.clone();
        int merke;
        int s;
        
        for (int i = 1; i < z.length; i++) {
            merke = z[i];
            s=0;
            
            while (z[s]<merke) {
                s++;
            }
            
            
            for (int t = i; t>=s+1; t--) {
                z[t]=z[t-1];
            }
            
            z[s]=merke;
            
        }
 
        return z;
    }

}
