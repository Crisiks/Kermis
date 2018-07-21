package kermis;

import java.util.Arrays;

public abstract class RisicoRijkeAttractie extends Attractie {
	boolean gekeurd = false;
	int [] aantalKeerGedraaid = new int[1];
	int [] draailimiet = new int[1];
	
	public void opstellingsKeuring(RisicoRijkeAttractie r1, Kassa kassa1) throws Exception {
		try {
			if (Arrays.equals(aantalKeerGedraaid, draailimiet)) {
//				System.out.println("LET OP!" + r1.naam + " moet nu gekeurd worden.");
				throw new Exception();
				}
			}
		catch(Exception e) {
			System.out.println("LET OP!" + r1.naam + " moet nu gekeurd worden. Druk op [m]onteur.");
			char c = scanner.next().charAt(0);
			switch (c) {
			case 'm':
				r1.aantalKeerGedraaid[0] = 0;
				System.out.println(r1.naam + " is goedgekeurd door de monteur!");
				terugNaarSubmenu(r1, kassa1);
				break;
			}
		}
	}
	
	void terugNaarSubmenu(RisicoRijkeAttractie r1, Kassa kassa1) throws Exception {
		opstellingsKeuring(r1, kassa1);
	}		
}
