package kermis;


public class Spin extends RisicoRijkeAttractie{
	Spin (String deNaam, double dePrijs, int deOppervlakte, int i) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht[0] = i;
	}
	
	void spinOproepen(Spin sp1, Kassa kassa1) {
		System.out.println(sp1.naam + " blaast iedereen van zijn sokken! Wat wil je weten?" + "\n" + "[v]erkoop een kaartje, [k]aantal kaartjes verkocht, [o]omzet, [t]terug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'v':
				sp1.kaartjesverkocht[0]++;
				terugNaarSubmenu(sp1, kassa1);
				break;
			case 'k':
				System.out.println("Er zijn al " + sp1.kaartjesverkocht + " kaartjes verkocht.");
				terugNaarSubmenu(sp1, kassa1);
				break;
			case 'o':
				double omzetSpin = sp1.kaartjesverkocht[0] * sp1.prijs;
				System.out.println("Er is al €" + omzetSpin + " omzet gedraaid.");
				terugNaarSubmenu(sp1, kassa1);
				break;
			case 't':
				kassa1.attractieOproepen(kassa1);
			default:
				System.out.println("Dat is geen geldige keuze.");
				terugNaarSubmenu(sp1, kassa1);
		}		
	}
	
	void terugNaarSubmenu(Spin sp1, Kassa kassa1) {
		spinOproepen(sp1, kassa1);
	}

}