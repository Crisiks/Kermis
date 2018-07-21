package kermis;

public class Botsautos extends Attractie {
	
	Botsautos (String deNaam, double dePrijs, int deOppervlakte, int i) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht[0] = 0;
	}
	
	void botsautosOproepen(Botsautos b1, Kassa kassa1) {
		System.out.println(b1.naam + " gaat helemaal los! Wat wil je weten?" + "\n" + "[v]erkoop een kaartje, [k]aantal kaartjes verkocht, [o]omzet, [t]terug naar hoofdmenu.");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'v':
				b1.kaartjesverkocht[0]++;
				terugNaarSubmenu(b1, kassa1);
				break;
			case 'k':
				System.out.println("Er zijn al " + b1.kaartjesverkocht[0] + " kaartjes verkocht.");
				terugNaarSubmenu(b1, kassa1);
				break;
			case 'o':
				double omzetBotsautos = b1.kaartjesverkocht[0] * b1.prijs;
				System.out.println("Er is al €" + omzetBotsautos + " omzet gedraaid.");
				terugNaarSubmenu(b1, kassa1);
				break;
			case 't':
				kassa1.attractieOproepen(kassa1);
			default:
				System.out.println("Dat is geen geldige keuze.");
				terugNaarSubmenu(b1, kassa1);
		}		
	}
	
	void terugNaarSubmenu(Botsautos b1, Kassa kassa1) {
		botsautosOproepen(b1, kassa1);
	}
}