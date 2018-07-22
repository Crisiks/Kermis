package kermis;


public class Spin extends RisicoRijkeAttractie {
	Spin (String deNaam, double dePrijs, int deOppervlakte, int i, int hetDraailimiet) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht[0] = i;
		draailimiet[0] = hetDraailimiet;
	}
	
	void spinOproepen(Spin sp1, Kassa kassa1) throws Exception {
		opstellingsKeuring(sp1, kassa1);
		System.out.println(sp1.naam + " blaast iedereen van zijn sokken! Wat wil je doen?" + "\n" + "[v]erkoop een kaartje, aantal [k]aartjes verkocht oproepen, [o]mzet oproepen, [t]erug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'v':
				sp1.kaartjesverkocht[0]++;
				sp1.aantalKeerGedraaid[0]++;
//				System.out.println(sp1.aantalKeerGedraaid[0]);
//				System.out.println(sp1.draailimiet[0]);
				terugNaarSubmenu(sp1, kassa1);
				break;
			case 'k':
				System.out.println("Er zijn al " + sp1.kaartjesverkocht[0] + " kaartjes verkocht.");
				terugNaarSubmenu(sp1, kassa1);
				break;
			case 'o':
				double omzetSpin = sp1.kaartjesverkocht[0] * sp1.prijs;
				System.out.println("Er is al €" + omzetSpin/100 + " omzet gedraaid.");
				terugNaarSubmenu(sp1, kassa1);
				break;
			case 't':
				kassa1.attractieOproepen(kassa1);
				break;
//			case 'm':
//				sp1.aantalKeerGedraaid[0] = 0;
//				System.out.println(sp1.naam + " is goedgekeurd door de monteur!");
//				terugNaarSubmenu(sp1, kassa1);
//				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
				terugNaarSubmenu(sp1, kassa1);
		}		
	}
	
	void terugNaarSubmenu(Spin sp1, Kassa kassa1) throws Exception {
		spinOproepen(sp1, kassa1);
	}
}