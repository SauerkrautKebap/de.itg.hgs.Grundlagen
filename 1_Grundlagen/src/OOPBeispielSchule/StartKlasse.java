package OOPBeispielSchule;

public class StartKlasse {

    
    public static void main(String[] args) {
     
     //Schuelerobjekt erstellen	
     Schueler s1 = new Schueler("Maier","Max");
     s1.setOrt("Singen");
     s1.setPlz(78224);
     
     //Objekt einerSchulklasse erstellen
     Schulklasse tg113 = new Schulklasse("TG11-3");
     tg113.setBeschreibung("Erstes Jahr am Informationstechnischen Gymnasium");
     
     //Assoziation "Schueler kennt seine Klasse" setzen
     s1.setSchulklasse(tg113);
    
     
     //Ausgabe der Schuelerdaten �ber toString Methoden beider Objekte
     System.out.println(s1);
     
     //Nur Klassendaten ausgeben
     System.out.println(s1.getSchulklasse());
       
    }

}
