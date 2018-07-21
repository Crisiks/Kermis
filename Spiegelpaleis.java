package kermis;

public class Spiegelpaleis extends Attractie{
	Spiegelpaleis (String deNaam, double dePrijs, int deOppervlakte, int i) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht[0] = 0;
	}
	
	void spiegelpaleisOproepen(Spiegelpaleis spp1, Kassa kassa1) throws Exception {
		System.out.println(spp1.naam + " laat iedereen hun ware ik zien! Wat wil je weten?" + "\n" + "[v]erkoop een kaartje, [k]aantal kaartjes verkocht, [o]omzet, [t]terug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'v':
				spp1.kaartjesverkocht[0]++;
				terugNaarSubmenu(spp1, kassa1);
				break;
			case 'k':
				System.out.println("Er zijn al " + spp1.kaartjesverkocht[0] + " kaartjes verkocht.");
				terugNaarSubmenu(spp1, kassa1);
				break;
			case 'o':
				double omzetSpiegelpaleis = spp1.kaartjesverkocht[0] * spp1.prijs;
				System.out.println("Er is al €" + omzetSpiegelpaleis + " omzet gedraaid.");
				terugNaarSubmenu(spp1, kassa1);
				break;
			case 't':
				kassa1.attractieOproepen(kassa1);
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
				terugNaarSubmenu(spp1, kassa1);
		}		
	}
	
	void terugNaarSubmenu(Spiegelpaleis spp1, Kassa kassa1) throws Exception {
		spiegelpaleisOproepen(spp1, kassa1);
	}
}