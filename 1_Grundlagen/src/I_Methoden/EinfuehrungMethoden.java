package I_Methoden;

public class EinfuehrungMethoden {

    // Hauptprogramm
    public static void main(String[] args) {
       System.out.println("Hallo hier bin ich");
        zeichneLinie();
        zeichneLinie(80);
        zeichneLinie(80,'*');
   }

    // Einfache Methode, ohne R�ckgabewert
    public static void zeichneLinie() {
        System.out.println("-------------------------");
    }
    
    //Einfache �berladene Methode mit �bergabeparameter
    //ohne R�ckgabewert
    public static void zeichneLinie(int anzahlStriche){
        for (int i = 0; i < anzahlStriche; i++) {
            System.out.print("-");
        }
        System.out.println();
     }
    
    public static void zeichneLinie(int anzahlStriche, char zeichen){
        for (int i = 0; i < anzahlStriche; i++) {
            System.out.print(zeichen);
        }
        System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
