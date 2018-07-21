package kermis;

class Hawaii extends RisicoRijkeAttractie{
	Hawaii (String deNaam, double dePrijs, int deOppervlakte, int i, int hetDraailimiet) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht[0] = i;
		draailimiet = hetDraailimiet;
	}

	void hawaiiOproepen(Hawaii h1, Kassa kassa1) {
		opstellingsKeuring(h1);
		System.out.println(h1.naam + " gaat vliegensvlug de hoogte in! Wat wil je weten?" + "\n" + "[v]erkoop een kaartje, [k]aantal kaartjes verkocht, [o]omzet, [t]terug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'v':
				h1.kaartjesverkocht[0]++;
				h1.aantalKeerGedraaid[0]++;
				terugNaarSubmenu(h1, kassa1);
				break;
			case 'k':
				System.out.println("Er zijn al " + h1.kaartjesverkocht[0] + " kaartjes verkocht.");
				terugNaarSubmenu(h1, kassa1);
				break;
			case 'o':
				double omzetHawaii = h1.kaartjesverkocht[0] * h1.prijs;
				System.out.println("Er is al €" + omzetHawaii + " omzet gedraaid.");
				terugNaarSubmenu(h1, kassa1);
				break;
			case 't':
				kassa1.attractieOproepen(kassa1);
				break;
			case 'm':
				h1.aantalKeerGedraaid[0] = 0;
				System.out.println(h1.naam + " is goedgekeurd door de monteur!");
				terugNaarSubmenu(h1, kassa1);
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
				terugNaarSubmenu(h1, kassa1);
			}		
		}
	
	void terugNaarSubmenu(Hawaii h1, Kassa kassa1) {
		hawaiiOproepen(h1, kassa1);
		}
}