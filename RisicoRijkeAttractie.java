package kermis;

public abstract class RisicoRijkeAttractie extends Attractie {
	boolean gekeurd = false;
	int [] aantalKeerGedraaid = new int[1];
	int draailimiet;
	
	public boolean opstellingsKeuring(RisicoRijkeAttractie r1) {
		if (aantalKeerGedraaid[0] < draailimiet) {
			r1.gekeurd = true;
			//System.out.println(r1.naam + " hoeft nog niet gekeurd te worden.");
		}
		if (aantalKeerGedraaid[0] >= draailimiet) {
			r1.gekeurd = false;		
			System.out.println("LET OP!" + r1.naam + " moet nu gekeurd worden. Druk op [m]onteur.");
		}
		return gekeurd;
	}
}
