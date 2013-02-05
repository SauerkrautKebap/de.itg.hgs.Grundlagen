package I_Methoden;

import java.util.Scanner;

//ax^2+bx+c=d
//x1|x2 = -p/2+- Wurzel ( (p/2)^2-q)
//Diskriminante = (p/2)^2-q

//Diskriminate  >0 -> 2 L�sungen
//Diskriminante <0 -> keine L�sung
//diskriminante =0 -> 1 L�sung
public class QuadratischeGleichung {

    public static void main(String[] args) {
        //Eingabe
        double x1,x2,a,b,c,d,diskriminante;
        String l�sung;
        Scanner s = new Scanner(System.in);
        
        do {
            //7x^2+3x-5=12
            System.out
                    .println("Geben sie die Koeffizienten der Quadratischen Gleichung ein:");
            System.out.print("a: ");
            a = s.nextDouble();
            System.out.print("b: ");
            b = s.nextDouble();
            ;
            System.out.print("c: ");
            c = s.nextDouble();
            ;
            System.out.print("d: ");
            d = s.nextDouble();
            //Verarbeitung
            //7x^2+3x-17=0
            c = c - d;
            d = 0;
            //x^2 + 3/7x -17/7 = 0
            b = b / a;
            c = c / a;
            a = 1;
            //Diskriminante     
            diskriminante = (b * b / 4) - c;
            if (diskriminante > 0) {
                x1 = -b / 2 + Math.sqrt(diskriminante);
                x2 = -b / 2 - Math.sqrt(diskriminante);
                l�sung = "x1 = " + x1 + "\nx2 = " + x2;
            } else if (diskriminante == 0) {
                x1 = -b / 2;
                l�sung = "x1 = " + x1;
            } else {
                l�sung = "Es gibt keine L�sung";
            }
            //Ausgabe
            System.out.println(l�sung);
            System.out.println("Verlassen mit einer Taste");
        } while (!s.next().equalsIgnoreCase("q"));
    }
}
