package B1_Verzweigungen;

/**
 * In diesem Beispiel wird der Unterschied zwischen
 * mehreren If-Verzwiegungen und einer If-else if-else Verzweigung
 * verdeutlicht.
 * @author hr
 *
 */

public class B1_3_Mehrfachverzweigung {

    //Hauptprogramm
    public static void main(String[] args) {
       
        //Eingabe
        double gewicht = 80; 
        String meldungElseIf="";
        String meldungIf="";
        
        
        //Verarbeitung
        //Pr�fung mit if else if und else
        if (gewicht > 100 ) {
        	meldungElseIf="schwer";
        }
        else if(gewicht >90){
        	meldungElseIf="�ppig";
        }
        else{
        	meldungElseIf="normal";
        }
       
        
        //pr�fung mit mehreren if
        if (gewicht > 100 ) {
        	meldungIf="schwer";
        }
        
        if(gewicht >90 ){
        	meldungIf="�ppig";
        }
        else{
        	meldungIf="normal";
        }
       
        
        //Ausgabe
        System.out.println("Ergebnis mit else if:\t\t"+meldungElseIf);
        System.out.println("Ergebnis mit mehreren if:\t"+meldungIf);
        
 
    }
}
