package P3a_BidirektionaleAssoziation1_n;

public class StartKlasse {
	
	public static void main(String[] args) {
		Mutter m = new Mutter("Meier","Lisa");	
		Kind fritz = new Kind("Meier","Fritz");
		Kind heinz = new Kind("Meier","Heinz");
		
		m.addKind(fritz);
		heinz.setMutter(m);
		
		System.out.println(m);	
		System.out.println(fritz);
	}
}
