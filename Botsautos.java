package kermis;

public class Botsautos extends Attractie {
	
	Botsautos (String deNaam, double dePrijs, int deOppervlakte, int deKaartjesVerkocht) {
		naam = deNaam;
		prijs = dePrijs;
		oppervlakte = deOppervlakte;
		kaartjesverkocht = deKaartjesVerkocht;
	}
	
	void botsautosOproepen(Botsautos b1) {
		System.out.println(b1.naam + " draait overuren!" + "\n" + "Wat wil je weten?");
		char c = scanner.next().charAt(0);
		switch (c) {
			case 'k':
				System.out.println("Er zijn al " + b1.kaartjesverkocht + " kaartjes verkocht.");
				break;
			case 'o':
				double omzetBotsautos = b1.kaartjesverkocht * b1.prijs;
				System.out.println("Er is al €" + omzetBotsautos + " omzet gedraaid.");
				break;
			default:
				System.out.println("Dat is geen geldige keuze.");
		}		
	}
}